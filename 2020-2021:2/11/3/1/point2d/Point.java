package point2d;

class Point {
    double x;
    double y;

    public Point(){} //default no args ctor

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //private -> package private "nothing" -> protected -> public
    void move(double dx, double dy) {
        x += dx;
        y += dy;
        // int c;
    }

    void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    void mirror(Point p) {
        x = 2 * p.x - x; 
        y = 2 * p.y - y; 
    }

    double distance(Point p) {
        double resX = x - p.x;
        double resY = y - p.y;
        return Math.sqrt(resX*resX + resY*resY);
    }

    static double distance(Point p1, Point p2) {
        double resX = p1.x - p2.x;
        double resY = p1.y - p2.y;
        return Math.sqrt(resX*resX + resY*resY);
    }

}