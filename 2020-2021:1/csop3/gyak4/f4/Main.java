public class Main {
    public static void main(String[] args) {
        Integer[] linearData = new Integer[]{1,2,3,4,5,6};
        IntegerMatrix im = new IntegerMatrix(2 , 3, linearData);
        System.out.println(im);
    }
}