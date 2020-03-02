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
        // 13-as sorban létrejöttet

        Foo obj2;
        new Foo(20);
        obj2 = obj;

        // 2. Mely objektumokat törölheti a garbage collector ezen a ponton?
        // 22-es sorban létrejöttet (és a 13-as sorban létrejöttet, ha azt még nem törölte)

        obj2 = new Foo(30);
        obj2 = new Foo(20);

        //26-os sorból mindegyiket törölheti ha még nem tette, illetve a 28-as sorban létrejöttet
    }
}


