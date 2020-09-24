package stringutils;

public class IterLetter {
    private String myString;
    private int counter=0;

    public IterLetter(String myString) { // "a"
        if(myString == null) { 
            throw new IllegalArgumentException();
        }
        this.myString = myString;
    }
    private boolean hasNext() {
        return counter < myString.length();
    }
    public void printNext() {
        if(hasNext()) {
            System.out.println(myString.charAt(counter++));
            //myString.charAt(5) == myString[5]
        }
    }
    void restart() {
        counter = 0;
    }
}