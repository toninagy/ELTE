public class Main {

    private static void foo(Printable printableObject) {
        printableObject.print();
    }

    public static void main(String[] args) {
        Printable something = new PrintablePoint(3,4);
        foo(something);
        something = new Book("author", "title");
        foo(something);
        something = new PrintableAndReversablePoint(1,2);
        foo(something);
        ReversablePoint reversablePoint = new ReversablePoint(20,30);
        System.out.println(reversablePoint.getX());
        System.out.println(reversablePoint.getY());
        reversablePoint.setX(40);
        reversablePoint.setY(50);
        System.out.println(reversablePoint.getX());
        System.out.println(reversablePoint.getY());
        reversablePoint.reverse();
        System.out.println(reversablePoint.getX());
        System.out.println(reversablePoint.getY());
    }
    
}
