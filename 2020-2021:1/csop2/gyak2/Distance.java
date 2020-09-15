public class Distance {
    public static void main(String[] args) {
        if(args.length % 2 != 0) {
            throw new RuntimeException();
        } 
        int sum = 0;
        for(int i=0; i<args.length-2; i+=4) {
            Point p1 = new Point(Double.parseDouble(args[i]), Double.parseDouble(args[i+1]));
            Point p2 = new Point(Double.parseDouble(args[i+2]), Double.parseDouble(args[i+3]));
            sum += Point.distance(p1,p2);
        }
        System.out.println(sum);
    }
}
