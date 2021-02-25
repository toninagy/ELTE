package circle;

import circle.utils.Point;

public class Circle {
    private double x = 0;
    private double y = 0;
    private double radius = 1;
    // boolean big;

    public Circle(){}

    public Circle(double x, double y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    void enlarge(double f) {
        radius *= f;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point(x,y);
    }

    // public boolean isBig() {
    //     return big;
    // }

}
