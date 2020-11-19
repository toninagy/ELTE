import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        try(Scanner sc = new Scanner(new File("input.txt"))) {
            while(sc.hasNextLine()) {
                bag.add(sc.nextLine());
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        HashMap<String, Integer> map = (HashMap<String, Integer>) bag.getMap();

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for(String str: map.keySet()) {
            System.out.println(str);
        }

        for(Integer i: map.values()) {
            System.out.println(i);
        }
    }
}
