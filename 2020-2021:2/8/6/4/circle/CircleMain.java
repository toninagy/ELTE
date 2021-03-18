package circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle.setX(5);
        circle.setY(2);
        circle.setRadius(10);
        Circle inCircle = Circle.readFromFile("in.txt");
        System.out.println(inCircle.getX());
        System.out.println(inCircle.getY());
        circle.saveToFile("outCircle.txt");
    }
}
