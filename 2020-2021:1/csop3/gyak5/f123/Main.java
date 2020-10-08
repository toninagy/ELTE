public class Main {
    public static void main(String[] arguments) {
        try {
            if(arguments.length == 3) {
                double a = Double.parseDouble(arguments[0]);
                double b = Double.parseDouble(arguments[1]);
                String mely = arguments[2];
                switch (mely) {
                    case "+":
                        System.out.println("Összeg: " + (a+b));
                        break;
                    case "-":
                        System.out.println("Kivonás: " + (a-b));
                        break;
                    case "*":
                        System.out.println("Szorzás: " + (a*b));
                        break;
                    case "/":
                        if(b == 0) {
                            throw new ArithmeticException("Attempted division by zero!");
                        }
                        System.out.println("Hányados: " + a/b);
                        System.out.println("Maradék: " + a%b);
                        break;
                    default: 
                        throw new IllegalArgumentException("Illegal arguments provided!");
                }
            }
            else {
                throw new IllegalArgumentException("Illegal arguments provided!");
            }
        } catch(NumberFormatException ex) {
            System.out.println(ex.getMessage());
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } 
        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
