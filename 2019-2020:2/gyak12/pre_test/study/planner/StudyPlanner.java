package study.planner;

import java.util.*;

public class StudyPlanner implements Comparable<StudyPlanner>{

    Map<String,Set<Integer>> bookToPages;

    public boolean isStudied(String bookName, int page) {
        return isStudied(bookName, page, page);
    }

    protected int sumOfPages() {
        int sum = 0;

        for(Set<Integer> s: bookToPages.values()) {
            sum += s.size();
        }

        return sum;
    }

    public boolean isStudied(String bookName, int pageFrom, int pageTo) {
        Set<Integer> pageSet = getPageSet(bookName);
        for(int i = pageFrom; i<= pageTo; i++) {
            if(pageSet.contains(i)) return true;
        }
        return false;
    }

    public int getBookCount() {
        return bookToPages.size();
    }

    protected Set<Integer> getPageSet(String bookName) {
        Set<Integer> set = bookToPages.get(bookName);
        if(set == null) throw new StudyException(String.format("Book %s is unknown!\n",bookName));
        return set;
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

            if (split.length < 3)   continue;

            int from = Integer.parseInt(split[0]);
            int to = Integer.parseInt(split[1]);
            String bookName = joinTexts(2, split);

            Set<Integer> lineElems = bookToPages.get(bookName);
            if (lineElems == null)   lineElems = new HashSet<>();

            for (int j = from; j <= to; j++) {
                if (lineElems.contains(j))   throw new StudyException("Book " + bookName + " already contains page " + j);
                lineElems.add(j);
            }

            bookToPages.put(bookName, lineElems);
        }
    }

    private String joinTexts(int idx, String[] split) {
        StringBuilder retVal = new StringBuilder();
        retVal.append(split[2]);
        for (int i = 3; i < split.length; i++) {
            retVal.append(" ");
            retVal.append(split[i]);
        }
        return retVal.toString();
    }

    @Override 
    public boolean equals(Object o) {
        if(o == null) return false;
        if(!getClass().equals(o.getClass())) return false;

        StudyPlanner other = (StudyPlanner) o;

        return bookToPages.equals(other.bookToPages);
    }

    @Override
    public int hashCode() {
        return bookToPages.hashCode();
    }

    @Override
    public int compareTo(StudyPlanner other) {
        return sumOfPages() - other.sumOfPages();
    }

}
