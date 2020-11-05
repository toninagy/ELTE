import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class UnmodifiableStringArray {
    private final String[] stringArray;

    public UnmodifiableStringArray(String[] stringArray) {
        this.stringArray = Arrays.copyOf(stringArray, stringArray.length);
    }

    public static UnmodifiableStringArray empty() {
        return new UnmodifiableStringArray(new String[0]);
    }

    public String get(int index) {
        if(index < 0 || index >= stringArray.length) {
            throw new IllegalArgumentException();
        }
        return stringArray[index];
    }

    public String find(String str) {
        for(String string: stringArray) {
            if(string.equals(str)) {
                return string;
            }
        }
        return null;
    }

    public boolean contains(String str) {
        for(String string: stringArray) {
            if(string.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String[] sort() {
        List<String> strList = Arrays.asList(stringArray);
        Collections.sort(strList);
        return strList.toArray(String[]::new);
    }

    public String[] getAllItems() {
        return Arrays.copyOf(stringArray, stringArray.length);
    }

    public int size() {
        return stringArray.length;
    }

    public int maxLength() {
        int maxl = -1;
        for(String string: stringArray) {
            if(string.length() > maxl) {
                maxl = string.length();
            }
        }
        return maxl;
    }

    public int minLength() {
        int minl = Integer.MAX_VALUE;
        for(String string: stringArray) {
            if(string.length() < minl) {
                minl = string.length();
            }
        }
        return minl;
    }

    public int allLength() {
        int sum = 0;
        for(String string: stringArray) {
            sum += string.length();
        }
        return sum;
    }

}
