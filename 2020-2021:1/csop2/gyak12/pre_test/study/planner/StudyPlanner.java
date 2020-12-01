package study.planner;

import java.util.*;

public class StudyPlanner {

    Map<String,Set<Integer>> bookToPages;

    public int getBookCount() {
        return bookToPages.size();
    }

    protected Set<Integer> getPageSet(String bookName) {
        Set<Integer> pageSet = bookToPages.get(bookName);
        if(pageSet == null) {
            throw new StudyException("Book " + bookName + " is unknown!\n");
        }
        return pageSet;
    }

    public int pageCountOf(String bookName) {
        return getPageSet(bookName).size();
    }

    public void readPagesFromText(Scanner sc) {
        bookToPages = new HashMap<>();

        int lineCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lineCount; i++) {
            String line = sc.nextLine();
            String[] split = line.split(" ");

            if (split.length < 3) {
                continue;
            } 

            int from = Integer.parseInt(split[0]);
            int to = Integer.parseInt(split[1]);
            String bookName = joinTexts(2, split);

            Set<Integer> lineElems = bookToPages.get(bookName);
            if (lineElems == null) {
                lineElems = new HashSet<>();
            } 
            for (int j = from; j <= to; j++) {
                if (lineElems.contains(j)) {
                    throw new StudyException("Book " + bookName + " already contains page " + j);
                }
                lineElems.add(j);
            }

            bookToPages.put(bookName, lineElems);
        }
    }


    private String joinTexts(int idx, String[] split) {
        StringBuilder retVal = new StringBuilder();
        retVal.append(split[2]);
        for (int i = 3; i < split.length; i++) {
            retVal.append(" " + split[i]);
        }
        return retVal.toString();
    }
}
