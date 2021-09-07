public class Program {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Num of params is not equal to 2");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if(b == 0) {
            System.out.println("Division by zero");
            return;
        }
        System.out.println(a/b);
    }
}
