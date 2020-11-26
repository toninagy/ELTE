public class Main {

    static void foo(Printable printableObj) {
        printableObj.print();
    }

    public static void main(String[] args) {
        Point point = new Point(1,2);
        PrintablePoint pp = new PrintablePoint(3,4);
        ReversablePoint rp = new ReversablePoint(10,20);
        PrintableAndReversablePoint prp = new PrintableAndReversablePoint(6,9);
        // pp.print();
        prp.print();
        prp.setX(9);
        prp.setY(10);
        prp.print();
        prp.reverse();
        prp.print();
        foo(pp);
    }
    
}
