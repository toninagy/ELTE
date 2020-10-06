import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        try(BufferedReader br = new BufferedReader(new FileReader(new File("in.txt"))); PrintWriter pw = new PrintWriter(new File("out.txt"));) {
            // br = new BufferedReader(new FileReader(new File("in.txt")));
            // // BufferedWriter bw = new BufferedWriter(new FileWriter(new File("out.txt")));
            // pw = new PrintWriter(new File("out.txt"));
            // int c = 5;
            // while(5 == c) 
            String s;
            while( ( s = br.readLine()) != null) {
                String[] nums = s.split(",");
                int sum = 0;
                for(String num: nums) {
                    sum += Integer.parseInt(num);
                }
                pw.println(sum);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
