package trig;
//package hu.antalnagy.trig; //conventional way to name packages is to start with domain followed by company name/personal name 
                            //and actual package name (one or more)

public class Application {

    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        p1.mirror(2,2);
        System.out.println(p1.getX() + "," + p1.getY());
        Point p2 = new Point(3,3);
        p1.mirror(p2);
        System.out.println(p1.getX() + "," + p1.getY());
        System.out.println(p1.distance(p2));

        Circle c1 = new Circle(3, 5, 3);
        Circle c2 = new Circle(40, 50, 30);
        Circle c3 = new Circle(20, 10, 10);
        c3.enlarge(5);
        System.out.println(c3.radius);
    }
}