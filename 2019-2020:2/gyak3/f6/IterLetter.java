package stringutils;

public class IterLetter {
    private String myString;
    private int counter=0;

    public IterLetter(String myString) {
        if(myString == null) {
            throw new IllegalArgumentException();
        }
        this.myString = myString;
    }
    boolean hasNext() {
        return counter < myString.length();
    }
    public void printNext() {
        if(hasNext()) {
            System.out.println(myString.charAt(counter++));
        }
    }
    void restart() {
        counter = 0;
    }
}