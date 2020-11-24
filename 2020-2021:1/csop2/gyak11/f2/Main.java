public class Main {

    static void foo(Printable printableObject) {
        printableObject.print();
    }
    
    public static void main(String[] args) {
        PrintablePoint pp = new PrintablePoint(5,6);
        ReversablePoint rp = new ReversablePoint(1,2);
        PrintableAndReversablePoint prp = new PrintableAndReversablePoint(4,5);
        foo(pp);
        prp.setY(100);
        foo(prp);
        prp.reverse();
        foo(prp);
    }
}
