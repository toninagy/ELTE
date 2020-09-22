package circle;

import circle.utils.Point;

public class Circle {
    private Point center;
    private double rad;

    public Circle(Point center, double rad) {
        this.center = center;
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public Point getCenter() {
        return center;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

}
