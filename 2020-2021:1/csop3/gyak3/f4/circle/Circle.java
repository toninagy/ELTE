package circle;

import circle.utils.Point;

public class Circle {
    private Point center;
    private double rad;

    public Circle(Point center, double rad) {
        this.center = center;
        this.rad = rad;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point p) {
        center = p;
    } 

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
}
