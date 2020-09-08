public class Calculate {
    public static void main(String[] args) {
        if(args.length == 2) {
            int from = Integer.parseInt(args[0]);
            int to = Integer.parseInt(args[1]);

            for(int i = from; i < to; i++) {
                System.out.println(i/2);
            }
        }
    }
}
