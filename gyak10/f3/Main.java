import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

import static java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        File input = new File(args[0]);
        Bag<String> stat = new Bag<>();
        try(Scanner sc= new Scanner(input)) {
            while(sc.hasNextLine()) {
                stat.add(sc.nextLine());
            }
        } catch(FileNotFoundException e) {
        
        }
        for(Map.Entry<String,Integer> entry: stat.getMap().entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}