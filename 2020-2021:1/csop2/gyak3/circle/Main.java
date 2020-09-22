package circle;

import circle.utils.Point;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1.1, 2.2), 1);
        System.out.println(circle.getRad());
    }
}
