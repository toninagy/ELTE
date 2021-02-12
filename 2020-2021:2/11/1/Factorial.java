public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(Factorial.factorial(4));
        System.out.println(recFactorial(5));
    }
    
    public static int factorial(int num) {
        int prod = 1;
        for(int i = 1; i <= num; i ++) {
            prod *= i;
        }
        return prod;
    }

    public static int recFactorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * recFactorial(num-1);
    }
}
