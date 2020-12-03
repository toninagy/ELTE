import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Point> listOfPoints = new ArrayList<>();
        System.out.println(new Point(30, 31).compareTo(new Point(30,29)));

        listOfPoints.add(new Point(10,10));
        listOfPoints.add(new Point(1,10));
        listOfPoints.add(new Point(10,1));
        listOfPoints.add(new Point(10,15));
        listOfPoints.add(new Point(15,30));
        listOfPoints.add(new Point(13,1));

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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ":" + y + ")";
    }

    // @Override
    // public int compareTo(Point that) {
    //     if(this.x < that.x) {
    //         return -1;
    //     }
    //     if(this.x == that.x) {
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
        int xCompareResult = Integer.compare(this.x, that.x);
        if(xCompareResult == 0) {
            return Integer.compare(this.y, that.y);
        }
        return xCompareResult;
    }

}