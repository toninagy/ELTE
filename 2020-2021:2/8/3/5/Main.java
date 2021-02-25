import stringutils.IterLetter;

public class Main {
    public static void main(String[] args) {
        IterLetter il = new IterLetter("hello");
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.restart();
        il.printNext();
    }
}