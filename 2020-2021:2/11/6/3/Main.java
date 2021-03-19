import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Token to search for:");
        String token = System.console().readLine();

        File input = new File(args[0]);
        try(Scanner sc = new Scanner(input)) {
            int counter = 0;
            while(sc.hasNext()) {
                String line = sc.nextLine();
                if(line.contains(token)) {
                    counter++;
                }
            }

            System.out.println(counter);
        } catch(FileNotFoundException ex) {
            System.out.println("File wasn't found");
        }
    }
}
