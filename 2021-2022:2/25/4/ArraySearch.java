public class ArraySearch {
    public static void main(String[] args) {
        double[] arr = new double[]{1.3, 5.2, 7.7, -2.3, 23.45};
        // double[] arr2 = new double[10];

        double avg = 0.0;
        double sum = 0.0;

        for(int i=0; i<5; i++) {
            sum += arr[i];
        }

        avg = sum / 5;

        System.out.println(avg);
        
        double smallestDifference = Math.abs(arr[0] - avg);
        double smallestValue = arr[0];

        for(double elem : arr) {
            if(smallestDifference > Math.abs(elem - avg)) {
                smallestValue = elem;
                smallestDifference = Math.abs(elem - avg);
            }
        } //enhanced for loop or foreach

        System.out.println(smallestDifference);
        System.out.println(smallestValue);
    }
}
