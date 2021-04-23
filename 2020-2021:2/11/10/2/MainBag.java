// alternative main class 



import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class MainBag
{
    public static void main(String[] args) throws NotInBagException
    {

        Bag<String> bag = new Bag<>(); //create object of Bag
        bag.add("foo");
        bag.add("foo");
        bag.add("foo");
        bag.add("foo2");
        bag.add("foo3");
        bag.add("idk");
        bag.add("idk");
        System.out.println("Word statistics: " + bag);
        
        bag.remove("idk");
        System.out.println("Word statistics after removing: " + bag);
        
        int x = bag.countOf("foo");
        System.out.println("number of foo inside bag: " + x);


        File input = new File(args[0]);
        Bag<String> statistics = new Bag<>();

        try (Scanner sc = new Scanner(input))
        {
            while (sc.hasNextLine())
            {
                statistics.add(sc.nextLine());
            }
        }  
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to access file: " + args[0]);
        }   

        System.out.println("Word statistics of the input file: " + statistics);
    } 
}



