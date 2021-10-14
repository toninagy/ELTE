public class Program {
    public static void main(String[] args) {
        if(args.length != 3) {
            throw new IllegalArgumentException("Num of params is not equal to 3");
        }
        try {
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
                default -> throw new IllegalArgumentException("Unsupported operation");
            }
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException block");
            System.out.println(e.getMessage());
        } catch(ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
