import java.util.ArrayList;

public class Main {
    private static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for(String element : list) {
            if(!element.isBlank() && element.charAt(0) == element.charAt(element.length()-1)) {
                result.add(element);
            }
        }
        return result;
    }
    private static void removeStrDifferBeginningAndEnding(ArrayList<String> list) {
        list.removeIf(element -> element.isBlank() || element.charAt(0) != element.charAt(element.length()-1));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("ada");
        list.add("cpp");
        list.add(" ");
        list.add("%sd%");
        list.add("%asd");
        
        System.out.println(list);
        System.out.println(getStrSameBeginningAndEnding(list));
        // System.out.println(getStrSameBeginningAndEnding(new ArrayList<>(list)));
        removeStrDifferBeginningAndEnding(list);
        System.out.println(list);
    }
}
