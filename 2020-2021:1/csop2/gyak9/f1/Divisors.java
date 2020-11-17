import java.util.*;

public class Divisors {

    static List<Integer> divisors(int num) { //return a List instead of a more specific LinkedList
        List<Integer> divisors = new LinkedList<>();
        for(int i=1; i<(num/2)+1; i++) {
            if(num%i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = (LinkedList<Integer>) divisors(20);
        System.out.println(divisors(20));
        System.out.println(list.getLast());
        // System.out.println((LinkedList<Integer>) (divisors(20)).getLast()); //compilation error
    }
    
}
