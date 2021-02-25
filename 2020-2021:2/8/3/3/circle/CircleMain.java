package circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle.setX(5);
        circle.setY(2);
        circle.setRadius(10);
        System.out.println(circle.getArea());
        Circle circle2 = new Circle(1,2,3);
        System.out.println(circle2.getRadius());
        // circle.setRadius(-2);

        circle.utils.Point center = circle2.getCenter();
        System.out.println(center.getX());
        System.out.println(center.getY());
    } 
}
