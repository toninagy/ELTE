import java.util.ArrayList;

public class Main {
    public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for(String string : list) {
            if(!string.isBlank() && string.charAt(0) == string.charAt(string.length()-1)) {
                result.add(string);
            }
        }
        return result;
    }

    public static void removeStrDifferBeginningAndEnding(ArrayList<String> list) {
        // list.removeIf(str -> {
        //     System.out.println("Barmi");
        //     return str.isBlank() || str.charAt(0) != str.charAt(str.length()-1);
        // });
        list.removeIf(str -> str.isBlank() || str.charAt(0) != str.charAt(str.length()-1));
    }
    public static void main(String[] args) {
        //pass by value/reference
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("ada");
        list.add("cpp");
        list.add("%cpp%");
        list.add(" ");

        System.out.println(list);
        System.out.println(getStrSameBeginningAndEnding(list));
        removeStrDifferBeginningAndEnding(list);
        System.out.println(list);
    }
}
