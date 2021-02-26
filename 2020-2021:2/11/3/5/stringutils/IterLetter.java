package stringutils;

public class IterLetter {

    String str; 
    private int counter;

    public IterLetter(String str) {
        if(str == null) {
            throw new IllegalArgumentException("String param cannot be null!");
        }
        this.str = str;
        this.counter = 0;
    }

    public boolean hasNext() {
        return counter < str.length();
    }

    public void printNext() {
        if(hasNext()) {
            System.out.println(str.charAt(counter++));
        }
    }

    public void restart() {
        this.counter = 0;
    }
}