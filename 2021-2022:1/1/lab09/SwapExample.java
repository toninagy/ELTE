import java.util.Arrays;

public class SwapExample {

    private static <T> void swap(T[] arr, int i1, int i2) {
        T temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    } 

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1,2,3,4};
        swap(arr1, 0, 2);
        System.out.println(Arrays.toString(arr1));
        Double[] arr2 = new Double[]{1.1,2.2,3.3,4.4};
        swap(arr2, 1, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
