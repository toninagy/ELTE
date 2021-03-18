import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        String token = System.console().readLine();
        File input = new File(args[0]);

        try (Scanner scanner = new Scanner(input)) {
            int counter = 0;
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.contains(token)) {
                    counter++;
                }
            }
            System.out.println(counter);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
