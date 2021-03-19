public class Calculator {
    public static void main(String[] args) {
        try {
            if(args.length == 3) {
                String numStr1 = args[0];
                String numStr2 = args[2];
                double num1 = Double.parseDouble(numStr1);
                String op = args[1];
                double num2 = Double.parseDouble(numStr2);
                
                switch(op) {
                    case "+" -> System.out.println(num1 + num2);
                    case "-" -> System.out.println(num1 - num2);
                    case "*" -> System.out.println(num1 * num2);
                    case "/" -> {
                        if(num2 == 0) {
                            throw new ArithmeticException("Attempted division by zero");
                        }
                        System.out.println(num1 / num2);
                    } 
                    default -> throw new IllegalArgumentException("Operation not supported");
                }
            }
            else {
                throw new IllegalArgumentException("Not exactly 3 args");
            }
        } catch(NumberFormatException ex) {
            // System.out.println("Invalid program
            // arguments provided");
            System.out.println(ex.getMessage());
        } catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch(RuntimeException ex) {
            System.out.println("Unknown exception occurred");
        }
    }
}
