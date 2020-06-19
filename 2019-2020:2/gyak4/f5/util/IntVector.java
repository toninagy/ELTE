package util;

import java.util.Arrays;
import java.util.stream.*; 

public class IntVector {
    int[] ns;

    public IntVector(int[] numbers) {
        ns = new int[numbers.length];
        //different methods of copying the contents of two arrays, unfortunately all of these produce a shallow copy only
        //1
        for(int i=0; i<numbers.length; i++) {
            ns[i] = numbers[i];
        }
        //2
        ns = Arrays.copyOf(numbers, numbers.length);
        //3
        ns = numbers.clone();
        //4
        ns = Arrays.stream(numbers).toArray();
        //5
        ns = IntStream.of(numbers).toArray();
    }

    public void add(int n) {
        for (int i = 0; i < ns.length; i++)
            ns[i] += n;
    }

    public String toString() {
        return Arrays.toString(ns);
    }
}