package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.Triangle;

public class TriangleTest {

    @Test 
    public void test1() {
        int[] input = {10, 2, 5, 1, 8, 20}; // triangle
        assertEquals(1, Triangle.solution(input));
    }

    @Test 
    public void test2() {
        int[] input = {10, 50, 5, 1}; // No triangle
        assertEquals(0, Triangle.solution(input));
    }

    @Test 
    public void test3() {
        int[] input = {2147483647, 2147483647, 2147483647}; // No triangle
        assertEquals(1, Triangle.solution(input));
    }

    @Test 
    public void test4() {
        int[] input = {-2147483648, -2147483648, -2147483648}; // No triangle
        assertEquals(0, Triangle.solution(input));
    }
    
}

