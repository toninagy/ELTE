public class PointMain {
   public static void main(String[] args) {
       Point point1 = new Point();
       Point point2 = new Point(5.2,4.3);
       System.out.println(point1.x);
       System.out.println(point2.x);
       System.out.println("----");
       point2.move(1.1, 1.2);
       System.out.println(point2.x);
       System.out.println(point2.y);
       System.out.println("----");
       point1.mirror(5.5, 7);
       System.out.println(point1.x);
       System.out.println(point1.y);
       System.out.println("----");
       point1.mirror(point2);
       System.out.println(point1.x);
       System.out.println(point1.y);
       double result = point2.distance(point1);
       System.out.println(result);
       System.out.println(point2.distance(point1));
       System.out.println("----");
       double result2 = Point.distance(new Point(1,2), new Point(10,11));
       System.out.println(result2);
   } 
}
