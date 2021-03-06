class Calculator {
    public static void main(String[] args){
        try {
            if (args.length != 3){
                throw new IllegalArgumentException();
            } else {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                String c = args[2];
                switch (c) {
                    case "+":
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "*":
                        System.out.println(a * b);
                        break;
                    case "/":
                        if (b == 0) {
                            throw new ArithmeticException();
                        }
                        System.out.println(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid program arguments provided.");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occured.");
        }
    }
}
