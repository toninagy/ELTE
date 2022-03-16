import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // File inputFile = new File("in2.txt"); if file is non-existent, it prints "File not found", afterwards the program execution doesn't stop, but NPE will be thrown shortly
        File inputFile = new File("in.txt");
        File outputFile = new File("out.txt");
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
        } catch(FileNotFoundException ex) {
            System.out.println("File not found");
        } catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            br.close();
            pw.close();
        }
    }
}
