import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class IO2 {
    public static void main(String[] args) {
        if(args.length != 1) {
            throw new IllegalArgumentException("Exactly one cmd argument required!");
        }
        System.out.println("Please enter the string:");
        Scanner sc = new Scanner(System.in);
        String tokenToFind = sc.next();
        final Path THE_PATH = Paths.get(args[0]);
        try(BufferedReader br = Files.newBufferedReader(THE_PATH)) {
            String line;
            int sum = 0;
            while((line = br.readLine()) != null) {
                sum += line.contains(tokenToFind) ? 1 : 0;
            }
            System.out.println(sum);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}