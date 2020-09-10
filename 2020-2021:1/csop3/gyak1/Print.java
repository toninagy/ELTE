import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        // non-conventional
        // String s = System.console().readLine(); 
        // System.console().printf("Hello " + s);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Hello " + s);


    }
}
