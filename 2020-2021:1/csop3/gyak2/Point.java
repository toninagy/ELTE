public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public void mirror(double cx, double cy) {
        this.x = 2*cx - x;
        this.y = 2*cy - y;
    }

    public void mirror(Point that) {
        this.x = that.x * 2 - x;
        this.y = that.y * 2 - y;
    }

    public double distance(Point p) {
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