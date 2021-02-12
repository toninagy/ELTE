import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr1 = sc.next();
        String numStr2 = sc.next();
        int num1 = Integer.parseInt(numStr1);
        int num2 = Integer.parseInt(numStr2);
        System.out.println(num1/2);
        System.out.println(num2/2);
    }
}
