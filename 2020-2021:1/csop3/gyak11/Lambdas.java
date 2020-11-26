public class Lambdas {

    static Abc abcImpl;
    public static void main(String[] args) {
        abcImpl = new De();
        Abc abcImplAnon = new Abc() {
            @Override
            public void a(int x) {
                System.out.println("Hello world");
            }
        };
        Abc lambda = param -> System.out.println("Hello world");
        // Abc lambda2 = System.out::println;
    }
}

interface Abc {
    void a(int x);

    default void fsnidfn(){}
}

class De implements Abc {
    @Override
    public void a(int x) {System.out.println("Hello world");}
}
