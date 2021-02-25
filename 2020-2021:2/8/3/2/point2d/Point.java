package point2d;

public class Point {
    public double x = 5;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){}

    //private -> "nothing" package private -> protected -> public 
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    } 

    public void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    public void mirror(Point p) {
        this.x = 2*p.x - this.x;
        this.y = 2*p.y - this.y;
    }

    public double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}