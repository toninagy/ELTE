
public class Main2 {
    public static void main(String[] args) {
        String s1;
        //System.out.println("len of s1 = " + s1.length());

        String s2 = "";
        System.out.println("len of s2 = " + s2.length());
        s2 += "hello";
        s2 += "world";

        // Mely objektumokat törölheti a garbage collector ezen a ponton?

        System.out.println("len of s2 = " + s2.length());
    }
}

class Example3a {

    public static int runClassMethod(int i, long l, float f,
        double d, Object o, byte b) {

        return 0;
    }

    public int runInstanceMethod(char c, double d, short s,
        boolean b) {

        return 0;   
    }
}
