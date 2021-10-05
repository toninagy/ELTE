public class ArrayExample {

    public static void main(String[] args) {
        double[] doubleArr = new double[]{1.3, 5.2, 7.7, -2.3, 23.45};
        Double[] doubleArr2 = new Double[5];
        double avg = 0.0;
        for(double num : doubleArr) {
            avg += num;
        }
        avg /= 5;
        System.out.println(avg);
        double smallestDiff = Double.MAX_VALUE;
        double resultValue = 0.0;
        for(double num : doubleArr) {
            if(smallestDiff > Math.abs(num - avg)) {
                smallestDiff = Math.abs(num - avg);
                resultValue = num;
            }
        }
        System.out.println(resultValue);
    }
}