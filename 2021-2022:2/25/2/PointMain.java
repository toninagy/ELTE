public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println(p1.x);
        System.out.println(p1.y);
        p1.move(5.1,6.1);
        System.out.println(p1.x);
        System.out.println(p1.y);
        System.out.println("-----");
        p1.mirror(0,0);
        System.out.println(p1.x);
        System.out.println(p1.y);

        p2.x = 2.2;
        p2.y = 3.3;
        p1.mirror(p2);

        System.out.println(p1.x);
        System.out.println(p1.y);

        System.out.println(Point.distance(p1, p2));
        // System.out.println(p1.distance(p1, p2)); don't do this
        System.out.println(p1.distance(p2));

        Point p3 = new Point(1.5, 2.5);
        System.out.println(p3.x);
        System.out.println(p3.y);
    }
}
