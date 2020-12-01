import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Point> listOfPoints = new ArrayList<>();
        System.out.println(new Point(44,55).compareTo(new Point(44,51)));
        listOfPoints.add(new Point(10,30));
        listOfPoints.add(new Point(1,35));
        listOfPoints.add(new Point(15,6));
        listOfPoints.add(new Point(1,3));
        listOfPoints.add(new Point(30,30));

        System.out.println(listOfPoints);

        // Collections.sort(listOfPoints);
        // System.out.println(listOfPoints);

        Collections.sort(listOfPoints, (p1, p2) -> {
            if(p1.getX() > p2.getX()) return 1;
            if(p1.getX() < p2.getX()) return -1;
            return Integer.compare(p1.getY(), p2.getY());
        });
        System.out.println(listOfPoints);
    }
}

class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // @Override
    // public int compareTo(Point that) {
    //     if(this.x < that.x) {
    //         return -1;
    //     }
    //     if (this.x == that.x) {
    //         if(this.y < that.y) {
    //             return -1;
    //         }
    //         if(this.y == that.y) {
    //             return 0;
    //         }
    //         return 1;
    //     }
    //     return 1;
    // }

    @Override
    public int compareTo(Point that) {
        int xResult = Integer.compare(this.x, that.x);
        if(xResult == 0) {
            return Integer.compare(this.y, that.y);
        }
        return xResult;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
