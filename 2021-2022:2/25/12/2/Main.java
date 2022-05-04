import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0,0));
        points.add(new Point(5,4));
        points.add(new Point(3,3));
        points.add(new Point(2,8));
        points.add(new Point(2,1));

        System.out.println(points);
        Collections.sort(points);
        System.out.println(points);
    }
}
