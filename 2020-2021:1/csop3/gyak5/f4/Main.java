import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(new File("in.txt"))); 
        PrintWriter pw = new PrintWriter(new File("out.txt"));) {
            String s;
            while((s = br.readLine()) != null) {
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

    public static void main2(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // sc.close();

        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader(new File("in.txt")));
            // BufferedWriter bw = new BufferedWriter(new FileWriter(new File("out.txt")));
            pw = new PrintWriter(new File("out.txt"));
            String s;
            while((s = br.readLine()) != null) {
                String[] nums = s.split(",");
                int sum = 0;
                for(String num: nums) {
                    sum += Integer.parseInt(num);
                }
                pw.println(sum);
            }
            // int c;
            // while(5 == c) {
            // }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
        }
    }
}
