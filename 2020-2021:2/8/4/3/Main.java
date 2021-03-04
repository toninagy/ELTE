class Foo {
    private int x;

    public Foo(int x) {
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) {
        int counter = 0;

        Foo obj = new Foo(5);
        counter = 10;

        obj = new Foo(7);

        // 1. Mely objektumokat törölheti a garbage collector ezen a ponton?
        // A 13-as sorban létrejöttet

        Foo obj2;
        new Foo(20);
        obj2 = obj;

        Runtime.getRuntime().gc();
        System.gc();

        // 2. Mely objektumokat törölheti a garbage collector ezen a ponton?
        // A 22-es sorban létrejöttet és a 13-as ..

        obj2 = new Foo(30);
        obj2 = new Foo(20);
        // A 28-as sorban létrejöttet + a //26-os sorban levőket 
    }
}


