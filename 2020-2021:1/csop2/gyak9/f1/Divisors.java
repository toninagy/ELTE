import java.util.*;

public class Divisors {

    static LinkedList<Integer> divisors(int num) {
        LinkedList<Integer> divisors = new LinkedList<>();
        for(int i=1; i<(num/2)+1; i++) {
            if(num%i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        System.out.println(divisors(20));
        System.out.println(divisors(20).getLast());
    }
    
}
