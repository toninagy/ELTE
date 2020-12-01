package study.planner.test;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import study.planner.StudyPlanner;
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

    private static StudyPlanner studyPlannerInit(String s) {
        StudyPlanner sp = new StudyPlanner();
        sp.readPagesFromText(new Scanner(s));
        return sp;
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

}
