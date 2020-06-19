package circle.utils;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //ctor overloading
    public Point(double x) {
        this(x, 0); //inner ctor call
    }

    public void move(double dx, double dy) {
        x += dx;
        y +=dy;
    }

    public void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    public void mirror(Point p) {
        x = 2*p.getX() - x;
        y = 2*p.getY() - y;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getY() {
        return y;
    }

    public double distance(Point p) { //Applying the Pythagorean theorem
        double a = Math.abs(x - p.x);
        double b = Math.abs(y - p.y);
        return Math.sqrt(a*a + b*b);
    }
    public static double distance(Point p1, Point p2) {
        double a = Math.abs(p1.x - p2.x);
        double b = Math.abs(p1.y - p2.y);
        return Math.sqrt(a*a + b*b);
    }

}