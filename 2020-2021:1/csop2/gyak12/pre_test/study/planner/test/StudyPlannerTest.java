package study.planner.test;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import study.planner.StudyPlanner;
import study.planner.StrictStudyPlanner;
import java.util.Scanner;

public class StudyPlannerTest {

    private static final String INPUT_NO_LINES = String.join("\n", new String[] {
        "0",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 130 Analizis",
        "55 78 Programozasi Nyelvek Java"
    });

    private static final String INPUT_1 = String.join("\n", new String[] {
        "4",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 130 Analizis",
        "55 78 Programozasi Nyelvek Java"
    });

    private static final String INPUT_2 = String.join("\n", new String[] {
        "6",
        "67 78 Programozasi Nyelvek Java",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 123 Analizis",
        "55 66 Programozasi Nyelvek Java",
        "124 130 Analizis"
    });

    private static StudyPlanner studyPlannerInit(String s) {
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(new Scanner(s));
        return sp;
    }

    private static StrictStudyPlanner strictStudyPlannerInit(String s) {
        StrictStudyPlanner ssp = new StrictStudyPlanner();
        ssp.readPagesFromText(new Scanner(s));
        return ssp;
    }

    @Test
    public void noLines() {
        StudyPlanner sp = studyPlannerInit(INPUT_NO_LINES);
        assertEquals(0, sp.getBookCount());
    } 

    @Test
    public void exampleBookCount() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        assertEquals(2, sp.getBookCount());
    } 

    @Test 
    public void examplePageCount_Analizis() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        assertEquals(152, sp.pageCountOf("Analizis"));
    }

    @Test 
    public void examplePageCount_Java() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        assertEquals(35, sp.pageCountOf("Programozasi Nyelvek Java"));
    }

    @Test(expected = study.planner.StudyException.class) 
    public void missingBook() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        sp.pageCountOf("Missing Book");
    }

    @Test
    public void examplePageCountInStrict_Analizis() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_1);
        assertEquals(171, ssp.pageCountOf("Analizis"));
        assertNotEquals(sp.pageCountOf("Analizis"),ssp.pageCountOf("Analizis"));
    }

    @Test 
    public void isStudiedInStrict_1() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_1);

        assertFalse(sp.isStudied("Analizis", 141,149));
        assertTrue(ssp.isStudied("Analizis", 141,149));
    }

    @Test 
    public void isStudiedInStrict_2() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_1);

        assertFalse(sp.isStudied("Analizis", 143));
        assertTrue(ssp.isStudied("Analizis", 143));
    }

    @Test 
    public void studyDifferently() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_1);
        StudyPlanner sp2 = studyPlannerInit(INPUT_2);

        assertTrue(sp1.equals(sp2));
        assertEquals(sp1,sp2);
    }

    @Test 
    public void studyCompareTo_Equals() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_1);
        StudyPlanner sp2 = studyPlannerInit(INPUT_2);
        assertTrue(sp1.compareTo(sp2) == 0);
        assertEquals(0, sp1.compareTo(sp2));
    }

    // @Test 
    // public void studyCompareTo_Less() {
        
    // }

    // @Test 
    // public void studyCompareTo_Greater() {
        
    // }

}
