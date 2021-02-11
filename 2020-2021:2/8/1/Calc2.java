public class Calc2 {

    public static void main(String[] args) {
        if(args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("Sum " + (a+b));
            System.out.println("Difference " + (a-b));
            System.out.println("Product " + (a*b));

            if(b != 0) {
                System.out.println("Quotient " + (a/b));
                System.out.println("Mod " + (a%b));
            }
        }
        else {
            System.out.println("Not exactly 2 args provided");
        }
    }
}
