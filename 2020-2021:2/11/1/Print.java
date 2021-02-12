public class Print {
    public static void main(String[] args) {
        // for( int i = 1; i <= 4; i++ ) {
        //     System.out.println((double) i/2);
        // }
        // int i = 4;
        // // Integer i2 = 4;
        // System.out.println("Kiirtam " + i + " szamot");
        
        int i = 1;
        for( i = 1 ; i <= 4; i++ ) {
            System.out.println(i/2.0);
        }
        System.out.println("Kiirtam " + (i-1) + " szamot");
    }

    // byte, short, int, long, float, double, char, boolean - primitive types
    // Object, Integer, Character, ... - reference types (classes)
}
