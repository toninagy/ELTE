package study.planner;

import java.util.*;

public class StrictStudyPlanner extends StudyPlanner {
    
    @Override 
    public int pageCountOf(String bookName) {
        TreeSet<Integer> treeSet = new TreeSet<>(getPageSet(bookName));
        int max = treeSet.floor(Integer.MAX_VALUE);
        int min = treeSet.ceiling(Integer.MIN_VALUE);

        return max - min + 1;
    }

    @Override 
    public boolean isStudied(String bookName, int from, int to) {
        TreeSet<Integer> treeSet = new TreeSet<>(getPageSet(bookName));
        int max = treeSet.floor(Integer.MAX_VALUE);
        int min = treeSet.ceiling(Integer.MIN_VALUE);

        for(int i=from; i<=to; i++) {
            if(i>=min && i<=max) {
                return true;
            }
        }
        return false;
    }

    @Override 
    protected int pagesSum() {
        int sum = 0;
        for(Set<Integer> set : bookToPages.values()) {
            TreeSet<Integer> treeSet = new TreeSet<>(set); 
            sum += treeSet.floor(Integer.MAX_VALUE) - treeSet.ceiling(Integer.MIN_VALUE) + 1;
        }
        return sum;
    }
}
