public class Calculate2 {
    public static void main(String[] arguments) {
        if(arguments.length == 2) {

            int a = Integer.parseInt(arguments[0]);
            int b = Integer.parseInt(arguments[1]);

            System.out.println("Összeg: " + (a+b));
            System.out.println("Kivonás: " + (a-b));
            System.out.println("Szorzás: " + (a*b));

            if(b != 0) {
                System.out.println("Hányados: " + a/b);
                System.out.println("Maradék: " + a%b);
            }
        }
    }
}
