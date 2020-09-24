package circle;

import circle.utils.Point;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(2,5),1);
        System.out.println(c1.getCenter().getX());
        System.out.println(c1.getCenter().getY());
        System.out.println(c1.getRad());
    }
}
