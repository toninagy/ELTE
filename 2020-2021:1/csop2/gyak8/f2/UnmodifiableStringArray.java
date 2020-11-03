import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class UnmodifiableStringArray {
    private final String[] stringArray;

    public UnmodifiableStringArray(String[] stringArray) {
        this.stringArray = Arrays.copyOf(stringArray, stringArray.length);
    }

    public UnmodifiableStringArray empty() {
        return new UnmodifiableStringArray(new String[0]);
    }

    public String get(int index) {
        if(index < 0 || index > stringArray.length) {
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
        List<String> stringList = Arrays.asList(stringArray);
        Collections.sort(stringList);
        return stringList.toArray(String[]::new);
    }

    public String[] getAllItems() {
        return Arrays.copyOf(stringArray, stringArray.length);
    }

    public int size() {
        return stringArray.length;
    }

    public int maxLength() {
        int maxlen = -1;
        for(String str: stringArray) {
            if(str.length() > maxlen) {
                maxlen = str.length();
            }
        }
        return maxlen;
    }

    public int minLength() {
        int minlen = Integer.MAX_VALUE;
        for(String str: stringArray) {
            if(str.length() < minlen) {
                minlen = str.length();
            }
        }
        return minlen;
    }

    public int allLength() {
        int sum = 0;
        for(String str: stringArray) {
            sum += str.length();
        }
        return sum;
    }
}
