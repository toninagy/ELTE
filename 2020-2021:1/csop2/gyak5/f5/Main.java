import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")))) {
            String string = System.console().readLine();
            int sum = 0;
            String s;
            while( ( s = br.readLine()) != null) {
                // if(s.contains(string)) {
                //     sum += 1;
                // }
                sum += s.contains(string) ? 1 : 0;
            }
            System.out.println(sum);

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
