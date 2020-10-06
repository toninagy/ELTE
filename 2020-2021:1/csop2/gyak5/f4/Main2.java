import java.io.*;

public class Main2 {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        // Scanner sc = new Scanner(System.in);
        try {
            // while(5 == c) 
             br = new BufferedReader(new FileReader(new File("in.txt")));
            pw = new PrintWriter(new File("out.txt"));
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
        } finally {
            try{
                br.close();
                pw.close();
            } catch(IOException ioe) {

            }
            
        }
    }

    public static void main2(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter pw = null;
        // Scanner sc = new Scanner(System.in);
        try {
            // while(5 == c) 
             br = new BufferedReader(new FileReader(new File("in.txt")));
            pw = new PrintWriter(new File("out.txt"));
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
        } finally {
            br.close();
            pw.close();
        }
    }

    public static void main3(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        try {
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
        } finally {
            br.close();
            pw.close();
        }
    }
}
