import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")))) {
            String str = System.console().readLine();
            String s;
            int sum = 0;
            while((s = br.readLine()) != null) {
                sum += (s.contains(str)) ? 1 : 0;
                // if(s.contains(str)) sum += 1;
                // else sum +=0;
            }
            System.out.println(sum);   
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
