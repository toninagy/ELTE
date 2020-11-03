package datastructures.immutable;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import datastructures.Month;
import static datastructures.Month.*;

public class SetOfMonths {

    public static final SetOfMonths empty = new SetOfMonths((short) 0);
    private final short bitmask;

    private SetOfMonths(short bitmask) {
        this.bitmask = bitmask;
    }
    
    public SetOfMonths add(Month month) {
        int position = month.ordinal();
        return new SetOfMonths((short)(bitmask | (1 << position)));
    }

    // public void add(String[] months) {
    //     for(String month: months) {
    //         int position = Month.valueOf(month).ordinal();
    //         bitmask |= (1 << position);
    //     }
    // }

    public boolean contains(Month month) {
        return (bitmask >> month.ordinal()) % 2 != 0; 
    }

    public SetOfMonths remove(Month month) {
        int position = month.ordinal();
        int oneAtPosition = (1<<position); 
        int zeroAtPosition = ~(oneAtPosition);
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
        SetOfMonths set = SetOfMonths.empty;
        set.add(January).add(April).add(May);
        //obj -> January
        //obj -> January April
        //obj -> January April May
        SetOfMonths set2 = SetOfMonths.of(October, May, September, March).add(December).remove(December);
        System.out.println(set2);

        // final String s1 = "abc";
        // s1 += "de"; //"abc" x "abcde"

        try {
            set2.write("setExample.dat");
            SetOfMonths set3 = SetOfMonths.read("setExample.dat");
            System.out.println(set3);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}