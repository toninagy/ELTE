public class Point {
    double x;
    double y;
    static int id = 0;

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

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static Point getWeightCenter(Point[] pointArr) {
        double newX = 0.0;
        double newY = 0.0;
        for(int i=0; i < pointArr.length; i++) {
            newX += pointArr[i].x;
            newY += pointArr[i].y;
        }
        return new Point(newX / 3, newY / 3);
    }

}
