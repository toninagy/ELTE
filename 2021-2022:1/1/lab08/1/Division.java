import java.util.LinkedList;

public class Division {

    private static LinkedList<Integer> divisors(int num) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                linkedList.add(i);
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        System.out.println(divisors(12));
    }
}
