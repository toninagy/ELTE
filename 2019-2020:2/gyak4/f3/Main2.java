
public class Main2 {
    public static void main(String[] args) {
        String s1;
        //System.out.println("len of s1 = " + s1.length()); //uninitialised String

        String s2 = "";
        System.out.println("len of s2 = " + s2.length());
        s2 += "hello";
        s2 += "world";

        // Mely objektumokat törölheti a garbage collector ezen a ponton?
        // A String Pool-ban ezen a ponton három String van("","hello","helloworld"), ebből kettőre nincs referencia (az üres sztringre és a "hello"-ra)
        // ezért azokat begyűjtheti a szemétgyűjtő.
        // s2 = s2 ("hello") + "world", itt implicit konverzió történik StringBuilder-re a JVM által, konkatenáció helyett. 
        // Hasznosabbnak tűnhet, amikor pl. s2 = "a" + "b" + ... + "x" (ez így nem fordul le, de meggondolható a logika), és nem keletkezik 26(?) közbülső (intermediate) String az SP-be,
        // ("a","ab","abc"..."abc..x"), amiből jó eséllyel 25 szemét lesz (ha csak nincs rá más (strong)referencia) hanem csak egy darab StringBuilder a heapen.

        System.out.println("len of s2 = " + s2.length());
    }
}

class Example3a {

    // Ha nem osztálymetódus (static) hajtódik végre, akkor a Stack Frame (aktivációs rekord) Local Variable Array-ének (legelső) eleme egy rejtett "this" referenciatípus lesz.
    // A JVM implicit konvertálja a byte,short,char típusokat (csak az LVA-ben, amit csak a JVM használ, nem a programozó!) int-té.

    public int runInstanceMethod(char c, double d, short s,
        boolean b) {

        return 0;   
    }

    public static int runClassMethod(int i, long l, float f,
        double d, Object o, byte b) {

        return 0;
    }
}
