import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorialOf = scanner.nextInt();
        int result = 1;
        for( int i = 1; i<=factorialOf; i++) {
            result *= i; // result = result * i;
        }
        System.out.println("This is the result from the main method: " + result);

        // System.out.println("This is the result from fact(): " + Factorial.fact(factorialOf));
        System.out.println("This is the result from static method fact(): " + fact(factorialOf)); //same as above

        Factorial factorial = new Factorial();
        System.out.println("This is the result from instance method fact2(): " + factorial.fact2(factorialOf)); //same as above
        // System.out.println("This is the result from the static method fact(): " + factorial.fact(factorialOf)); //same as above

        int res = recFact(factorialOf);
        System.out.println(res);

    }

    public static int fact(int n) { //public > protected > package private (nothing) > private
        int result = 1;
        for( int i = 1; i<=n; i++) {
            result *= i; // result = result * i;
        }
        return result;
    }

    public int fact2(int n) { //public > protected > package private (nothing) > private
        int result = 1;
        for( int i = 1; i<=n; i++) {
            result *= i; // result = result * i;
        }
        return result;
    }

    public static int recFact(int n) {
        if(n == 1 || n == 0) {
            return 1;
        } 
        return n * recFact(n-1);   
    }
        
}
