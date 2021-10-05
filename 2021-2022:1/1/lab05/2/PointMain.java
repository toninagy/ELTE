public class PointMain {
    public static void main(String[] args) {
        Point[] pointArr = new Point[3];
        for(int i = 0; i < 3; i++) {
            double x = Double.parseDouble(System.console().readLine());
            double y = Double.parseDouble(System.console().readLine());
            pointArr[i] = new Point(x, y);
        }
        System.out.println(Point.getWeightCenter(pointArr));
    }
}
