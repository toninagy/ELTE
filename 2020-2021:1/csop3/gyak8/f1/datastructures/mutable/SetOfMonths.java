package datastructures.mutable;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import datastructures.Month;
import static datastructures.Month.*;

public class SetOfMonths {
    private short bitmask;

    private SetOfMonths(short bitmask) {
        this.bitmask = bitmask;
    }

    public static SetOfMonths empty() {
        return new SetOfMonths((short) 0);
    }
    
    public SetOfMonths add(Month month) {
        int position = month.ordinal(); //February -> 1
        bitmask |= (1 << position); //10
        //bitmask = bitmask | (1 << position) //000000000000
                                              //000000000010 |
                                              //000000000010
        return this;
    }

    public SetOfMonths add(String[] months) {
        for(String month: months) {
            int position = Month.valueOf(month).ordinal();
            bitmask |= (1 << position);
        }
        return this;
    }

    public boolean contains(Month month) {
        return (bitmask >> month.ordinal())%2 != 0; 
    }

    public SetOfMonths remove(Month month) {
        int position = month.ordinal();
        int oneAtPosition = (1<<position);  //000000000010
        int zeroAtPosition = ~(oneAtPosition); //111111111101
        bitmask &= zeroAtPosition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        short b = bitmask;
        for(Month month: Month.values()) { //11100011/1/00/1
            if(b%2!=0) {
                sb.append(month);
                sb.append(",");
            }
            b/=2;
        }
        sb.append("}");
        return sb.toString();
    }

    public static SetOfMonths of(Month... months) {
        short bitmask = 0;
        for(Month month: months) {
            int position = month.ordinal();
            bitmask |= (1<<position);
        }
        return new SetOfMonths(bitmask);
    }

    public void write(String fileName) throws IOException {
        try(DataOutputStream out = new DataOutputStream( new FileOutputStream( fileName ) )) {
            out.writeShort(bitmask);
        }
    }

    public static SetOfMonths read(String fileName) throws IOException {
        try(DataInputStream in = new DataInputStream( new FileInputStream( fileName ) )) {
            return new SetOfMonths(in.readShort());
        }
    }

    public static void main(String[] args) {
        // int abc = 0b0110;
        // int hex = 0xFF;
        System.out.println(SetOfMonths.empty().add(January).add(April).add(May).remove(January));
        SetOfMonths set = SetOfMonths.of(October, May, September, March).add(December).remove(December);
        System.out.println(set);

        try {
            set.write("setExample.dat");
            SetOfMonths set2 = SetOfMonths.read("setExample.dat");
            System.out.println(set2);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}