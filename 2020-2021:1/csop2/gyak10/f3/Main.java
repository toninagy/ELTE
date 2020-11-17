import java.io.IOException;
import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
        Map<String, Integer> bagMap = (HashMap<String, Integer>) bag.getMap();
        for(Map.Entry<String, Integer> entry: bagMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("------------");
        for(String key: bagMap.keySet()) {
            System.out.println(key);
        }
        for(Integer value: bagMap.values()) {
            System.out.println(value);
        }
    }
}
