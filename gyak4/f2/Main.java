

class Main {
    public static void main(String[] args) {
        System.out.print("Enter number of Points: ");
        int num = Integer.parseInt(System.console().readLine());
        Point[] arr = new Point[num];

        for (int i = 0; i < num; ++i) {
            System.out.print("Enter x = " );
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Enter y = " );
            double y = Double.parseDouble(System.console().readLine());

            arr[i] = new Point(x, y);
        }

        Point center = Point.centerOfMass(arr);
        System.out.println("center of mass: " + center);
    }
}


