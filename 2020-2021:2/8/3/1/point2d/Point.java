package point2d;

class Point {
    double x = 5;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){}

    //private -> "nothing" package private -> protected -> public 
    void move(double x, double y) {
        this.x += x;
        this.y += y;
    } 

    void mirror(double cx, double cy) {
        x = 2*cx - x;
        y = 2*cy - y;
    }

    void mirror(Point p) {
        this.x = 2*p.x - this.x;
        this.y = 2*p.y - this.y;
    }

    double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}