public class Main {
    public static void main(String[] args) {
        ExtendedString str1 = new ExtendedString("Java programming");
        ExtendedString str2 = new ExtendedString("C++ programming");

        System.out.println(str1.compareTo(str2));
        
        for(char c : str2) {
            System.out.println(c);
        }
    }
}
