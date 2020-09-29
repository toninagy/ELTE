package util;

import java.util.Arrays;

public class IntVector {
    int[] ns;

    public IntVector(int[] numbers) {
        ns = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            ns[i] = numbers[i];
        }
    }

    public void add(int n) {
        for (int i = 0; i < ns.length; i++)
            ns[i] += n;
    }

    @Override
    public String toString() {
        return Arrays.toString(ns);
    }
}