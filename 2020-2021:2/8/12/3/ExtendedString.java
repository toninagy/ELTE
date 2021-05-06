import java.util.*;

public class ExtendedString implements Comparable<ExtendedString>, Iterable<Character> {
    private final String data;

    public ExtendedString(String data) {
        this.data = data;
    }

    @Override 
    public String toString() {
        return data;
    }

    @Override
    public int compareTo(ExtendedString other) {
        return this.data.length() - other.data.length();
    }

    @Override 
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            private final String stringToIterate = data;
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return this.counter < this.stringToIterate.length();
            }

            @Override 
            public Character next() {
                return this.stringToIterate.charAt(this.counter++);
            }
        };
    }
}

// class MyIt implements Iterator<Character> {

// }
