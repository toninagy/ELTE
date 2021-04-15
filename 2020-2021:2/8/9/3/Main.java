import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

public class Main {
    private static void minToFront(ArrayList<Integer> numbers) {
        if(numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty!");
        }
        Integer min = Collections.min(numbers);
        numbers.remove(min);
        numbers.add(0, min);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(4, 65, 45, 44, 76, 2, 98, 72));
        System.out.println(numbers);
        minToFront(numbers);
        System.out.println(numbers);
    }
}
