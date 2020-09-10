public class Calc {
    public static void main(String[] args) {
        if(args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("Összeadás: " + (a+b));

            int res = a-b;

            System.out.println("Kivonás: " + res);
            System.out.println("Szorzás: " + a*b);
        
            if(b != 0) {
                System.out.println("Hányados: " + a/b);
                System.out.println("Maradék: " + a%b);
            }
        } 
        System.out.println(fact(6));
        System.out.println(Calc.fact(6));

        Calc calc = new Calc();
        // System.out.println(calc.fact(6)); //do not do this
        System.out.println(calc.fact2(6));

        System.out.println("Recursive factorial method result:");
        long r = recFact(4);
        System.out.println(r);
    }

    //access modifier - public > protected > package private (nothing) > private
    //static - non-static 
    //return type - types + void
    //method's name
    //(arguments)

    public static int fact(int n) {
        int result = 1;
        for(int i=1;i<n;i++) {
            result = result * i; //result *= i;
        }
        return result;
    }

    public int fact2(int n) {
        int result = 1;
        for(int i=1;i<n;i++) {
            result = result * i; //result *= i;
        }
        return result;
    }

    public static long recFact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n*recFact(n-1);
    }

}
