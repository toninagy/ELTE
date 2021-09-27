import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Sum {

    public static void main1(String[] args) throws IOException {
        File file = new File("in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int sum;
        while((line = br.readLine()) != null) {
            sum = 0;
            String[] split = line.split(",");
            for(String num : split) {
                sum += Integer.parseInt(num);
            }
            System.out.println(sum);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException {
        File fileIn = new File("in.txt");
        File fileOut = new File("out.txt");
        BufferedReader br = new BufferedReader(new FileReader(fileIn));
        PrintWriter pw = new PrintWriter(fileOut);
        String line;
        int sum;
        while((line = br.readLine()) != null) {
            sum = 0;
            String[] split = line.split(",");
            for(String num : split) {
                sum += Integer.parseInt(num);
            }
            pw.println(sum);
        }
        br.close();
        pw.close();
    }
}
