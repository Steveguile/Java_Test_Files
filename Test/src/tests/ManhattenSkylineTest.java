package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.ManhattenSkyline;

public class ManhattenSkylineTest {

    @Test 
    public void test1() {
        int[] heights = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        assertEquals(7, ManhattenSkyline.solution(heights));
    }


}
