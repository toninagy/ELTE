import java.util.Arrays;

public class Main {

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 9, 7};
        System.out.println(Arrays.toString(arr1));
        swap(arr1, 3, 4);
        System.out.println(Arrays.toString(arr1));

        Double[] arr2 = {2.1, 3.4, 5.8};
        System.out.println(Arrays.toString(arr2));
        swap(arr2, 0, 2);
        System.out.println(Arrays.toString(arr2));
    }
}
