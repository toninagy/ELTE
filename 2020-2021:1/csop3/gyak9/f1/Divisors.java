import java.util.*;

public class Divisors {

    static List<Integer> divisors(int num) {
        List<Integer> divList = new LinkedList<Integer>();
        for(int i=1; i<(num/2)+1; i++) {
            if(num % i == 0) {
                divList.add(i);
            }
        }
        return divList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> divisorsList = (LinkedList<Integer>) divisors(20);
        System.out.println(divisors(20));
        System.out.println(divisorsList.getLast());
    }

}