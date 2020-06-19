package trig;

public class Line {
    private double a;
    private double b;
    private double c;

    public boolean contains(Point p) {
        return a*p.getX() + b*p.getY() == c;
    }
    public static boolean isParallelWith(Line l1, Line l2) {
        return l1.a*l2.b == l2.a*l1.b;
    } 
    public boolean isParallelWith(Line that) {
        return this.a*that.b == that.a*this.b; //the slopes of the equations are equal //a két meredekség egyenlő
    }
    public boolean isOrthogonalTo(Line that) {
        return this.a*that.a == (-1)*this.b*that.b; //the product of the slopes is equal to -1 //a két meredekség szorzata -1
    }
}