public class PointMain {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.x);
        System.out.println(point.y);
        point.move(1, 2);
        System.out.println("---");
        System.out.println(point.x);
        System.out.println(point.y);
        point.mirror(2.6, 7.2);
        System.out.println("---");
        System.out.println(point.x);
        System.out.println(point.y);
        Point point2 = new Point(10.1,20.2);
        System.out.println("---");
        System.out.println(point2.x);
        System.out.println(point2.y);
        System.out.println("---");
        point.mirror(point2);
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println("---");
        double result = point2.distance(point);
        System.out.println(result);
    }
}
