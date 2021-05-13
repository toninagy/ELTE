package study.planner;

import java.util.*;

public class StrictStudyPlanner extends StudyPlanner {

    @Override 
    public int pageCountOf(String bookName) {
        TreeSet<Integer> treeSet = new TreeSet<>(getPageSet(bookName));
        int min = treeSet.ceiling(Integer.MIN_VALUE);
        int max = treeSet.floor(Integer.MAX_VALUE);

        return max - min + 1;
    }

    @Override
    public boolean isStudied(String bookName, int from, int to) {
        TreeSet<Integer> treeSet = new TreeSet<>(getPageSet(bookName));
        int min = treeSet.ceiling(Integer.MIN_VALUE);
        int max = treeSet.floor(Integer.MAX_VALUE);

        for(int i=from; i<=to; i++) {
            if(i>=min && i<= max) {
                return true;
            }
        }
        return false;
    }
    
}
