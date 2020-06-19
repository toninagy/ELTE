public class Calc {

    static int factorialRec(int n) {
        if(n == 1 || n == 0) {
            return 1;
        } 
        return n * factorialRec(n-1);   
    }

    static int factorialIterative(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i; //fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        if(args.length >= 2) {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println(i+j);
            System.out.println(i-j);
            System.out.println(i*j);
            if(j != 0) {
               System.out.println(i/j);
            }
            System.out.println(i%j);
        }

        System.out.println(Calc.factorialIterative(6));
        System.out.println(Calc.factorialRec(5));

        // OR
        // This works, because we have the two static methods from below in the very class we are calling them

        System.out.println(factorialIterative(6)); 
        System.out.println(factorialRec(5));

        Calc calc1 = new Calc(); // We don't often create instances (aka instantiate objects) of classes containing the psvm method
        System.out.println(calc1.factorialRec(5)); // ! (Very) bad practice

        String s1 = "abcd";
        s1 = "abcdef"; // This works, but it's merely resetting the reference s1 to a new String (constant) from the String Pool of the runtime data area (Heap Area more precisely)
                      // We are NOT by any means modifying the initial String!!!
                      // Strings are immutable in Java.
        System.out.println(s1);
        String s3 = "abcd"; 

        // Explicitly calling the constructor for String class is considered a very bad practice too, because this DOES NOT 
        // initiate the given String into the String Pool. It creates a new String object onto the heap, for each individual constructor call.

        String s2 = new String("abcde");
        String s4 = new String("abcde");

        //If we want to achieve modifications in a String, it's a common practice to use StringBuilders

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append("e");
        String s5 = sb.toString();
        System.out.println(s5);
    }
}