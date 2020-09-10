public class Print2 {
    public static void main(String[] args) {
        // for( int i = 1; i <= 4; i++ ) {
        //     System.out.println((double) i/2);
        // }
        // int i = 4;
        // System.out.println("Kiirtam " + i + " szamot");
        
        double i = 1;
        for( i = 1; i <= 4; i++ ) {
            System.out.println(i/2);
        }
        System.out.println("Kiirtam " + (int) (i-1) + " szamot");

        double c = 5; 
        int a = (int) c; 
        byte b = 120;
        long l = b;
    }
}

//primitive types - boolean, char, byte, short, int, long, float, double 
//wrapper classes - Boolean, Character, Byte, Short, Integer, Long, Float, Double
//reference types - class, interface, array