public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override 
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override 
    public int compareTo(Point that) {
        int xcomp = Integer.compare(this.x, that.x);
        if(0 == xcomp) {
            return Integer.compare(this.y, that.y);
        }

        return xcomp;
    }
}
