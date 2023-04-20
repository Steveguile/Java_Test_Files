package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.NumberOfDiscIntersections;

public class NumberOfDiscIntersectionsTest {

    @Test 
    public void test1() {
        int[] input = {1, 5, 2, 1, 4, 0}; 
        assertEquals(11, NumberOfDiscIntersections.solution(input));
    }

    @Test 
    public void test2() {
        int[] input = {1, 2147483647, 0}; 
        assertEquals(2, NumberOfDiscIntersections.solution(input));
    }

}

