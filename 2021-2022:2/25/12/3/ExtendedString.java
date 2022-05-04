import java.util.Iterator;

public class ExtendedString implements Iterable<Character>, Comparable<ExtendedString> {
    private String str;

    public ExtendedString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

    @Override
    public int compareTo(ExtendedString extendedString) {
        return this.str.length() - extendedString.str.length();
    }

    @Override 
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            private String innerStr = str;
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return this.counter < innerStr.length();
            }

            @Override 
            public Character next() {
                return innerStr.charAt(counter++);
            }
        };
    }
}
