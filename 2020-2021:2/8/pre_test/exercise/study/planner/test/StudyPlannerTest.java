package study.planner.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertThrows;

import study.planner.StudyPlanner;
import study.planner.StrictStudyPlanner;
import study.planner.StudyException;
import java.util.Scanner;

public class StudyPlannerTest {
    private static final String INPUT_0 = String.join("\n", new String[] {
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

    private static final String INPUT_3 = String.join("\n", new String[] {
        "6",
        "67 78 Programozasi Nyelvek Java",
        "10 20 Programozasi Nyelvek Java",
        "150 199 Analizis",
        "20 123 Analizis",
        "55 66 Programozasi Nyelvek Java",
        "124 130 Analizis"
    });

    private static StudyPlanner init(String str) {
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(new Scanner(str));
        return sp;
    }

    private static StrictStudyPlanner initStrict(String str) {
        StrictStudyPlanner ssp = new StrictStudyPlanner();
        ssp.readPagesFromText(new Scanner(str));
        return ssp;
    }

    @Test 
    public void noLines() {
        StudyPlanner sp = init(INPUT_0);
        assertEquals(0, sp.getBookCount());
    }

    @Test 
    public void exampleBookCount() {
        StudyPlanner sp = init(INPUT_1);
        assertEquals(2, sp.getBookCount());
    }

    @Test 
    public void examplePageCount_Analizis() {
        StudyPlanner sp = init(INPUT_1);
        assertEquals(152, sp.pageCountOf("Analizis"));
    }

    @Test 
    public void examplePageCount_Java() {
        StudyPlanner sp = init(INPUT_1);
        assertEquals(35, sp.pageCountOf("Programozasi Nyelvek Java"));
    }

    @Test 
    public void examplePageCountStrict_Java() {
        StrictStudyPlanner ssp = initStrict(INPUT_1);
        assertEquals(69, ssp.pageCountOf("Programozasi Nyelvek Java"));
    }

    @Test 
    public void exampleIsStudied() {
        StudyPlanner sp = init(INPUT_1);
        StrictStudyPlanner ssp = initStrict(INPUT_1);
        assertFalse(sp.isStudied("Analizis", 141, 149));
        assertTrue(ssp.isStudied("Analizis", 141, 149));
    }

    @Test(expected = study.planner.StudyException.class) 
    public void missingBook() {
        StudyPlanner sp = init(INPUT_1);
        // assertThrows(study.planner.StudyException.class, () -> sp.pageCountOf("Missing Book"));
        sp.pageCountOf("Missing Book");
    }

    @Test 
    public void testEquals() {
        StudyPlanner sp1 = init(INPUT_1);
        StudyPlanner sp2 = init(INPUT_2);
        assertEquals(sp1, sp2);
    }

    @Test 
    public void testCompareTo() {
        StudyPlanner sp1 = init(INPUT_2);
        StudyPlanner sp2 = init(INPUT_3);
        assertTrue(sp1.compareTo(sp2) < 0);
        assertTrue(sp2.compareTo(sp1) > 0);
    }

}
