import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void minToFront(ArrayList<Integer> numbers) {
        if(numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Integer min = Collections.min(numbers);
        numbers.remove(min);
        numbers.add(0, min);
        System.out.println("here");
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(4, 65, 45, 44, 76, 2, 98, 72));
        System.out.println(numbers);
        // minToFront(new ArrayList<>(numbers));
        minToFront(numbers);
        System.out.println(numbers);
    }
}
