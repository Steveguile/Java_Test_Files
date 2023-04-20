package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.MaxProductOfThree;

public class MaxProductOfThreeTest {

    @Test 
    public void test1() {
        int[] input = {-3, 1, 2, -2, 5, 6};
        assertEquals(60, MaxProductOfThree.solution(input));
    }

    @Test 
    public void test2() {
        int[] input = {};
        assertEquals(0, MaxProductOfThree.solution(input));
    }

    @Test 
    public void test3() {
        int[] input = {10, 10, 10};
        assertEquals(1000, MaxProductOfThree.solution(input));
    }

    @Test 
    public void test4() {
        int[] input = {4, 5, 1, 0};
        assertEquals(20, MaxProductOfThree.solution(input));
    }

    @Test 
    public void test5() {
        int[] input = {-10, -2, -4};
        assertEquals(-80, MaxProductOfThree.solution(input));
    }

    @Test 
    public void test6() {
        int[] input = {2, 4, 6, -2, -4, -6};
        assertEquals(-80, MaxProductOfThree.solution(input));
    }
}

