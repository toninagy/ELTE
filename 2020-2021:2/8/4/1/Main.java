import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {1.3, 5.2, 7.7, -2.3, 23.45};
        // double[] array1 = new double[]{1.3, 5.2, 7.7, -2.3, 23.45};
        // double[] array2 = new double[5];

        double sum = 0;
        for(int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        double avg = sum / array.length;

        double[] diffFromAvg = {0,0,0,0,0};
        for(int i=0; i<array.length; ++i) {
            diffFromAvg[i] = Math.abs(avg - array[i]);
        }

        // int min = Arrays.stream(diffFromAvg).map(element -> element*2).min().getAsInt();

        int minIdx = 0;
        for(int i=1; i<array.length; ++i) {
            if(diffFromAvg[i] < diffFromAvg[minIdx]) {
                minIdx = i;
            }
        }

        System.out.println("Avg: " + avg + ", closest item to avg: " + array[minIdx]);
    }
}