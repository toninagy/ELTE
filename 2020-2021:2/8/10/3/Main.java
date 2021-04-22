import java.util.Arrays;

public class Main {

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 9, 7};
        System.out.println(Arrays.toString(arr1));
        // Main.<Integer>swap(arr1, 3, 4);
        swap(arr1, 3, 4);
        System.out.println(Arrays.toString(arr1));
    }
}
