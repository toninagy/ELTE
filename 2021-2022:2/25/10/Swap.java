public class Swap {
    public static <T> void swap(T[] array, int p1, int p2) {
        T temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

        p1 = 100;
    }

    public static void main(String[] args) {
        Short[] shortArr = new Short[] {1,2,3,4};
        int p1 = 2;
        swap(shortArr, p1, 3); //shortArr reference is passed by value
        System.out.println(shortArr[2]);
        System.out.println(shortArr[3]);
        System.out.println(p1);
    }
}
