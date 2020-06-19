import java.util.LinkedList;

public class Divisors {
    public static LinkedList<Integer> divisors(int num) { //whenever possible, prefer lists to arrays (Effective Java 3rd Edition, Item 28)
        LinkedList<Integer> result = new LinkedList<>(); //always use generic types, never use raw types
        for(int i=1; i<=num/2+1; i++) {
            if(num % i == 0) {
                result.add(i);
            }
        }
        result.add(num);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divisors(10));
        System.out.println(divisors(20).getFirst());
    }
}