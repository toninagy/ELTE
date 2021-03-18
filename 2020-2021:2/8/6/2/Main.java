import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            helper(inputFile, outputFile, br, pw);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void helper(File inputFile, File outputFile, BufferedReader br, PrintWriter pw) throws IOException {
        try {
            br = new BufferedReader(new FileReader(inputFile));
            pw = new PrintWriter(outputFile);

            String line;
            while((line = br.readLine()) != null) {
                String[] split = line.split(",");
                int sum = 0;
                for(String numString : split) {
                    sum += Integer.parseInt(numString);
                }
                System.out.println(sum);
                pw.println(sum);
            }
            // br.close();
            // pw.close();
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to access file: " + inputFile.getName());
        } catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            // try {
            //     br.close();
            //     pw.close();
            // } catch(IOException ex) {
            //     ex.printStackTrace();
            // } if helper method does not throw
            br.close();
            pw.close();
        }
    }
}
