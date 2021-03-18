public class Calculator {

    public static void main(String[] args) {
        try {
            if(args.length == 3) {
                double a = Double.parseDouble(args[0]);
                String op = args[1];
                double b = Double.parseDouble(args[2]);
                
                switch(op) {
                    case "+" -> System.out.println(a+b);
                    case "-" -> System.out.println(a-b);
                    case "*" -> System.out.println(a*b);
                    case "/" -> {
                        if(b == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        System.out.println(a/b);
                    }
                    default -> throw new IllegalArgumentException("Invalid op");
                }
            }
            else {
                throw new IllegalArgumentException("Not exactly 3 args");
            }
        } catch(NumberFormatException ex) {
            System.out.println("Couldn't parse the numbers");
            System.out.println(ex.getMessage());
        } catch(ArithmeticException ex) {
            System.out.println("Possible division by zero");
            System.out.println(ex.getMessage());
        } catch(IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Program is exiting now");
        }
    }
}
