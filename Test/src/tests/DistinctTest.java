package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.Distinct;

public class DistinctTest {
 
    @Test
    public void test1() {
        int[] array = {2, 1, 1, 2, 3, 1};
        assertEquals(3, Distinct.solution(array)); 
    }

    @Test
    public void test2() {
        int[] array = {0, 1, -1, -2, 1};
        assertEquals(4, Distinct.solution(array)); 
    }
}

