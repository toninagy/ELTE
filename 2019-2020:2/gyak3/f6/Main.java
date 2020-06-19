public class Main {
    public static void main(String[] args) {
        stringutils.IterLetter il = new stringutils.IterLetter("abcdefg"); //instead of import one can always use the fqn(fully qualified name - (of packages))
        //The one case where one must use "full" names for types is when importing similarly named types => naming conflict => error if using only "short" name
        //E.g. import java.awt.List and import java.util.List
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
        il.printNext();
    }
}