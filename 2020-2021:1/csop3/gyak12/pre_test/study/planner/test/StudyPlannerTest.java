package study.planner.test;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import study.planner.*;
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

    private static StudyPlanner studyPlannerInit(String str) {
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(new Scanner(str));
        return sp;
    }

    private static StrictStudyPlanner strictStudyPlannerInit(String str) {
        StrictStudyPlanner ssp = new StrictStudyPlanner();
        ssp.readPagesFromText(new Scanner(str));
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
    public void pageCountOf_Difference() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_1);

        assertNotEquals(sp.pageCountOf("Analizis"), ssp.pageCountOf("Analizis"));
        assertEquals(152, sp.pageCountOf("Analizis"));
        assertEquals(171, ssp.pageCountOf("Analizis"));
    }

    @Test 
    public void isStudied_Difference1() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_1);

        assertFalse(sp.isStudied("Analizis", 141, 149));
        assertTrue(ssp.isStudied("Analizis", 141, 149));
    }

    @Test 
    public void isStudied_Difference2() {
        StudyPlanner sp = studyPlannerInit(INPUT_1);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_1);

        assertFalse(sp.isStudied("Analizis", 145));
        assertTrue(ssp.isStudied("Analizis", 145));
    }

    @Test
    public void studyDifferently() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_1);
        StudyPlanner sp2 = studyPlannerInit(INPUT_2);
        StrictStudyPlanner ssp2 = strictStudyPlannerInit(INPUT_2);

        assertTrue(sp1.equals(sp2));
        assertEquals(sp1,sp2);
        // assertNotEquals(sp1,ssp2); //getClass() version of equals
        assertEquals(sp1,ssp2);
    }

    @Test 
    public void compareTo_Equals() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_1);
        StudyPlanner sp2 = studyPlannerInit(INPUT_2);
        assertEquals(0, sp1.compareTo(sp2));
    }

    
    @Test 
    public void compareTo_Greater() {
        //TO-DO
    }

    @Test 
    public void compareTo_Less() {
        //TO-DO
    }

}
