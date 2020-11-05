package datastructures.immutable;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import datastructures.Month;
import static datastructures.Month.*;

public class SetOfMonths {
    private final short bitmask;

    public final static SetOfMonths empty = new SetOfMonths((short) 0);

    private SetOfMonths(short bitmask) {
        this.bitmask = bitmask;
    }
    
    public SetOfMonths add(Month month) {
        int position = month.ordinal();
        return new SetOfMonths((short) (bitmask | (1 << position)));
    }

    // public SetOfMonths add(String[] months) {
    //     for(String month: months) {
    //         int position = Month.valueOf(month).ordinal();
    //         bitmask |= (1 << position);
    //     }
    //     return this;
    // }

    public boolean contains(Month month) {
        return (bitmask >> month.ordinal())%2 != 0; 
    }

    public SetOfMonths remove(Month month) {
        int position = month.ordinal();
        int oneAtPosition = (1<<position);  //000000000010
        int zeroAtPosition = ~(oneAtPosition); //111111111101
        return new SetOfMonths((short) (bitmask & zeroAtPosition));
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
        SetOfMonths set = SetOfMonths.empty;
        System.out.println(set);
        set.add(January).add(April).add(May).remove(January);
        //January
        //January April
        //January April May
        //April May
        System.out.println(set);
        SetOfMonths set2 = SetOfMonths.of(October, May, September, March).remove(May);
        //October, May, September, March
        //October, September, March
        System.out.println(set2);

        try {
            set.write("setExample.dat");
            SetOfMonths set3 = SetOfMonths.read("setExample.dat");
            System.out.println(set3);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}