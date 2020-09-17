public class PointMain {
    public static void main(String[] args) {
        Point point1 = new Point(3,2);
        Point point2 = new Point(3.5,2.9);

        System.out.println(point1.getX());
        System.out.println(point2.getY());

        point1.move(1, 5);

        System.out.println(point1.getX());
        System.out.println(point1.getY());

        point2.mirror(point1);

        double result = Point.distance(point1, point2);
        System.out.println(result);
    }
}
