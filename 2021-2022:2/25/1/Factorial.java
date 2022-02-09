public class Factorial {

    public static int factorialRec(int n) {
        if(n == 0) {
            return 1;
        }
        return n*factorialRec(n-1);
    }

    public static void main(String[] args) {
        int a=1;
        int n = 5;
        for(int i=1; i<=n; i++) {
            a = a * i;
        }
        System.out.println(a);

        System.out.println(factorialRec(6));
    }
}
