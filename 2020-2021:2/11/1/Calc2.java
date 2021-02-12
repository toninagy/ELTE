public class Calc2 {
    public static void main(String[] args) {
        if(args.length == 2) {
            String numStr1 = args[0];
            String numStr2 = args[1];
            int num1 = Integer.parseInt(numStr1);
            int num2 = Integer.parseInt(numStr2);

            System.out.println("Osszeg " + (num1 + num2));
            System.out.println("Kulonbseg " + (num1 - num2));
            System.out.println("Szorzat " + (num1 * num2));

            if(num2 != 0) {
                System.out.println("Osztas " + (num1 / num2));
                System.out.println("Maradek " + (num1 % num2));
            }
        }
    }
}
