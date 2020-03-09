import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class IO1 {
    public static final Path THE_PATH = Paths.get("in.txt");
    public static final Path THE_PATH2 = Paths.get("out.txt");
    public static void main(String[] args) {
        try(BufferedReader br = Files.newBufferedReader(THE_PATH); PrintWriter pw = new PrintWriter(new File("out.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                int sum = 0;
                for (String string : tokens) {
                    sum += Integer.parseInt(string);
                }
                pw.println(sum);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void main2(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("in.txt")); BufferedWriter bw = Files.newBufferedWriter(THE_PATH2)) {
            String line;
            while((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                int sum = 0;
                for (String string : tokens) {
                    sum += Integer.parseInt(string);
                }
                bw.write(sum);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}