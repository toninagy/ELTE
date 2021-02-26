import stringutils.*;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        IterLetter il = new IterLetter(str);
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        // il.printNext();
        il.restart();
        il.printNext();
    }
}
