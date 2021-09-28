package point2d;

public class Point {
    public double x;
    public double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    public void mirror(Point point) {
        x = 2*point.x - x;
        y = 2*point.y - y;
    }

    public double distance(Point point) {
        double resX = x - point.x;
        double resY = y - point.y;
        return Math.sqrt(resX*resX + resY*resY);
    }

}
