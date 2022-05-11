package study.planner.test;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Scanner;

import study.planner.StrictStudyPlanner;
import study.planner.StudyPlanner;

public class StudyPlannerTest {
    private static final String INPUT_NO_LINES = String.join("\n", new String[] {
        "0",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 130 Analizis",
        "55 78 Programozasi Nyelvek Java",
    });
    private static final String INPUT_EX = String.join("\n", new String[] {
        "4",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 130 Analizis",
        "55 78 Programozasi Nyelvek Java",
    });
    private static final String INPUT_EX2 = String.join("\n", new String[] {
        "6",
        "67 78 Programozasi Nyelvek Java",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 123 Analizis",
        "55 66 Programozasi Nyelvek Java",
        "124 130 Analizis",
    });
    private static final String INPUT_EX3 = String.join("\n", new String[] {
        "5",
        "10 20 Programozasi Nyelvek Java",
        "150 190 Analizis",
        "20 123 Analizis",
        "55 66 Programozasi Nyelvek Java",
        "124 130 Analizis",
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
        assertEquals(0,sp.getBookCount());
    }

    @Test 
    public void exampleBookCount() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        assertEquals(2,sp.getBookCount());
    }

    @Test 
    public void examplePageCount_Analizis() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        assertEquals(152, sp.pageCountOf("Analizis"));
    }

    @Test 
    public void examplePageCount_Java() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        assertEquals(35, sp.pageCountOf("Programozasi Nyelvek Java"));
    }

    @Test(expected=study.planner.StudyException.class)
    public void missingBook() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        sp.pageCountOf("Missing Book");
    }

    @Test
    public void pageCountOf_differentInStrict() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_EX);

        assertEquals(152, sp.pageCountOf("Analizis"));
        assertEquals(171, ssp.pageCountOf("Analizis"));
    }

    @Test 
    public void isStudied_differentInStrict() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_EX);

        assertFalse(sp.isStudied("Analizis", 141,149));
        assertTrue(ssp.isStudied("Analizis", 141,149));
    }

    @Test 
    public void isStudied_differentInStrict2() {
        StudyPlanner sp = studyPlannerInit(INPUT_EX);
        StrictStudyPlanner ssp = strictStudyPlannerInit(INPUT_EX);

        assertFalse(sp.isStudied("Analizis", 145));
        assertTrue(ssp.isStudied("Analizis", 145));
    }

    @Test 
    public void studyDifferently() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_EX);
        StudyPlanner sp2 = studyPlannerInit(INPUT_EX2);

        assertTrue(sp1.equals(sp2));
        assertTrue(sp2.equals(sp1));
    }

    @Test 
    public void studyPlannerCompare_equals() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_EX);
        StudyPlanner sp2 = studyPlannerInit(INPUT_EX2);

        assertEquals(0, sp1.compareTo(sp2));
        assertEquals(0, sp2.compareTo(sp1));
    }

    @Test 
    public void studyPlannerCompare_less() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_EX3);
        StudyPlanner sp2 = studyPlannerInit(INPUT_EX);

        assertTrue(sp1.compareTo(sp2) < 0);
    }

    @Test 
    public void studyPlannerCompare_greater() {
        StudyPlanner sp1 = studyPlannerInit(INPUT_EX);
        StudyPlanner sp2 = studyPlannerInit(INPUT_EX3);

        assertTrue(sp1.compareTo(sp2) > 0);
    }

}