import java.util.stream.Stream;

public class Lambdas {

    private static abc myAbc;
    public static void main(String[] args) {
        myAbc = new abcImpl();
        abc anonClass = new abc() {
            @Override
            public void a(int x) {
                System.out.println("Hello world");
            }
        };
        abc lambda = (a) -> System.out.println(a);
        abc lambda2 = System.out::println;
        // Stream.of(1,2,3,4,5).forEach(abc::a);

    }
}

interface abc {
    void a(int x);
}

class abcImpl implements abc {
    @Override
    public void a(int x) {

    }
}