import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        // Returns most often a null Object in an IDE
        // String s = System.console().readLine();
        
        // Conventional way to read console input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer i = sc.nextInt();

        //Standard output to console
        System.out.println("Hello " + args[0]);
    }
}