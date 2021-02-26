package circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle.setX(5);
        circle.setY(2);
        circle.setRadius(10);
        System.out.println(circle.getArea());
        Circle circle2 = new Circle(1,2,5);
        System.out.println(circle2.getArea());
        circle.utils.Point p = circle.getCenter();
        System.out.println(p.x);
        System.out.println(p.y);
        // circle2.setRadius(-100);
    }
}
