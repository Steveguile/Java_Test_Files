package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.Worksheet;

public class WorksheetTest {

    @Test 
    public void test1() {
        int[] heights = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        assertEquals(7, Worksheet.solution(heights));
    }


}
