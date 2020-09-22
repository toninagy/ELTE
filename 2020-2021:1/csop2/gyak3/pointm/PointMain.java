package pointm;

import point2d.*;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Point p2 = new Point(2,9);
        Point p3 = new Point(1,5);

        p1.mirror(1, 4);
        p2.mirror(p3);
        System.out.println(p1.distance(p3));
        System.out.println("Y:" + p1.getY());
        System.out.println("X:" + p1.getX());
    }
}
