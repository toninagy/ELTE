package circle;

import java.io.IOException;

public class CircleMain {
    public static void main(String[] args) throws IOException {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        circle.setX(5);
        circle.setY(2);
        circle.setRadius(10);
        Circle c = Circle.readFromFile("in.txt");
        System.out.println(c.getX());
        circle.saveToFile("outCircle.txt");
    }
}
