import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContainsWord {
    public static void main(String[] args) throws IOException {
        File fileIn = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(fileIn));
        System.out.println("Provide an input string:\n");
        Scanner sc = new Scanner(System.in);
        String token = sc.next();
        String line;
        int linesSum = 0;
        while((line = br.readLine()) != null) {
            if(line.contains(token)) {
                linesSum++;
            }
        }
        br.close();
        System.out.println(linesSum);
    }
}
