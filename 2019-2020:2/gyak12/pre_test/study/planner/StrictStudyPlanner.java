package study.planner;

import java.util.TreeSet;
import java.util.Set;

public class StrictStudyPlanner extends StudyPlanner {

    @Override
    public int pageCountOf(String bookName) {
        TreeSet<Integer> ts = new TreeSet<>(getPageSet(bookName));

        int min = ts.ceiling(Integer.MIN_VALUE);
        int max = ts.floor(Integer.MAX_VALUE);

        return max - min + 1;
    }

    @Override
    public boolean isStudied(String bookName, int pageFrom, int pageTo) {
        TreeSet<Integer> ts = new TreeSet<>(getPageSet(bookName));

        int min = ts.ceiling(Integer.MIN_VALUE);
        int max = ts.floor(Integer.MAX_VALUE);

        for(int i=pageFrom; i<=pageTo; i++) {
            if(min <= i && i <= max) return true;
        }
        return false;
    }

    @Override
    protected int sumOfPages() {
        int sum = 0;
        for(Set<Integer> s: bookToPages.values()) {
            TreeSet<Integer> ts = new TreeSet<>(s);
            sum += ts.floor(Integer.MAX_VALUE) - ts.ceiling(Integer.MIN_VALUE) + 1;
        }

        return sum;
    }
    
}