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
        // 13-as sorban létrejött Foo-t

        Foo obj2;
        new Foo(20);
        obj2 = obj;

        System.gc(); //!

        // 2. Mely objektumokat törölheti a garbage collector ezen a ponton?
        // a 22-es sorban létrejöttet és a 13-as sorban létrejött Foo-t
        obj2 = new Foo(30);
        obj2 = new Foo(20);

        // a 26-os sorban említetteket és a 27-es sorban létrejöttet
    }
}


