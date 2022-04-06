import java.util.ArrayList;

public class Main2 {

    public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> list) {
        ArrayList<String> resultList = new ArrayList<>();
        for(String str : list) {
            if(!str.isBlank() && str.charAt(0) == str.charAt(str.length()-1)) {
                resultList.add(str);
            }
        }
        return resultList;
    }

    public static void removeStrDifferBeginningAndEnding(ArrayList<String> list) {
        // for(String str : list) {
        //     if(str.isBlank() || str.charAt(0) != str.charAt(str.length()-1)) {
        //         list.remove(str);
        //     }
        // }
        // list.forEach(str -> {
        //     if(str.isBlank() || str.charAt(0) != str.charAt(str.length()-1)) {
        //                 list.remove(str);
        //     }
        // });
        list.removeIf(str -> str.isBlank() || str.charAt(0) != str.charAt(str.length()-1));
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Main main = new Main();

        list.add("java");
        list.add("ada");
        list.add("cpp");
        list.add(" ");
        list.add("%sd%");
        list.add("%asd");
        
        System.out.println(list);
        // System.out.println(getStrSameBeginningAndEnding(list));
        // System.out.println(getStrSameBeginningAndEnding(new ArrayList<>(list)));
        removeStrDifferBeginningAndEnding(list);
        System.out.println(list);
    }
    
}
