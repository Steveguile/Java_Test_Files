package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.CyclicRotation;

public class CyclicRotationTest {

    @Test
    public void test1() {
        int[] array = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        assertArrayEquals(expected, CyclicRotation.solution(array, 3));
    }
    
    @Test
    public void test2() {
        int[] array = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, CyclicRotation.solution(array, 1));
    }

    @Test
    public void test3() {
        int[] array = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, CyclicRotation.solution(array, 4));
    }
}

