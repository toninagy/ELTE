public class PointMain {

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
        System.out.println(p.y);

        p.move(2.3, 5.4);

        System.out.println(p.x);
        System.out.println(p.y);

        p.mirror(1.1, 1.2);

        System.out.println(p.x);
        System.out.println(p.y);

        p.mirror(new Point());

        System.out.println(p.x);
        System.out.println(p.y);
    }
}
