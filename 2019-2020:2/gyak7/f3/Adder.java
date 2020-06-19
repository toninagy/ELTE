public class Adder {
    public static String add(String num1, String num2) {
        try {
            return Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
        } catch(NumberFormatException nfe) {
            try {
                return Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
            } catch(NumberFormatException nfe2) { // | NullPointerException ex) {
                throw new IllegalArgumentException("Params were not numbers");
            }
        }
    }
}