import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First num: ");
        String s1 = sc.next();
        int i1 = Integer.parseInt(s1);
        System.out.println("Second num: ");
        String s2 = sc.next();
        int i2 = Integer.parseInt(s2);

        for(int i=i1; i<=i2; i++) {
            System.out.println((double) i/2);
        }
    }

    //primitive types - boolean, char, byte, short, int, long, float, double
    //reference types - wrappers for primitives - Character, Integer, ...
}
