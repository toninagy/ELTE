public class Distance {

    public static void main(String[] args) {
        double distanceSum = 0.0;
        for(int i=0; i<args.length-2; i=i+2) {
            int x = Integer.parseInt(args[i]);
            int y = Integer.parseInt(args[i+1]);
            Point p1 = new Point(x,y);
            int x2 = Integer.parseInt(args[i+2]);
            int y2 = Integer.parseInt(args[i+3]);
            Point p2 = new Point(x2, y2);
            double distance = p1.distance(p2);
            distanceSum += distance;
        }
        System.out.println(distanceSum);
    }
}
