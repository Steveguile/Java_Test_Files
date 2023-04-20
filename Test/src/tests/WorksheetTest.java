package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.Worksheet;

public class WorksheetTest {

    @Test 
    public void test1() {
        int[] input = {1, 5, 2, 1, 4, 0}; 
        assertEquals(11, Worksheet.solution(input));
    }

    @Test 
    public void test2() {
        int[] input = {1, 2147483647, 0}; 
        assertEquals(2, Worksheet.solution(input));
    }

}

