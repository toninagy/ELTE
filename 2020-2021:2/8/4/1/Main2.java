public class Main2 {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        int n = Integer.parseInt(System.console().readLine());

        double[] array = new double[n];

        for(int i = 0; i < n; ++i) {
            array[i] = Double.parseDouble(System.console().readLine());
        }

        double sum = 0;
        for(int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        double avg = sum / array.length;

        double[] diffFromAvg = new double[n];
        for(int i=0; i<array.length; ++i) {
            diffFromAvg[i] = Math.abs(avg - array[i]);
        }

        int minIdx = 0;
        for(int i=1; i<array.length; ++i) {
            if(diffFromAvg[i] < diffFromAvg[minIdx]) {
                minIdx = i;
            }
        }

        System.out.println("Avg: " + avg + ", closest item to avg: " + array[minIdx]);
    }
}
