import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ExtendedString str1 = new ExtendedString("Java2 programming");
        ExtendedString str2 = new ExtendedString("C++ programming");

        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));

        // Iterator<Character> it = str2.iterator();
        // while(it.hasNext()) {
        //     char ch = it.next();
        //     System.out.println("ch: " + ch);
        // }

        for(char ch : str2) {
            System.out.println("ch: " + ch);
        }

        ArrayList<ExtendedString> list = new ArrayList<>();
        list.add(new ExtendedString("abc"));
        list.add(new ExtendedString("abcde"));
        list.add(new ExtendedString("abcd"));
        list.add(str1);
        list.add(str2);
        System.out.println(list);
        System.out.println("-----");
        Collections.sort(list);
        System.out.println(list);
    }
}
