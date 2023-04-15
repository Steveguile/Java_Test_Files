package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.sorting.CountSort;

public class CountSortTest {

    @Test
    public void test1() {
        int[] array = {3, 6, 2, 4, 7, 3};
        int[] expected = {2, 3, 3, 4, 6 ,7};
        // {3, 6, 2, 4, 7, 3}
        // 0  1  2  3  4  5  6  7  8  9 (because we put k as 9)
        // 0  0  1  2  1  0  1  1  0  0
        assertArrayEquals(expected, CountSort.solution(array, 9));
    }

    @Test
    public void test2() {
        int[] array = {3, 6, 2, 4, 7, 3};
        int[] expected = {}; // because we put k as 6 it shouldn't care about 7
        assertArrayEquals(expected, CountSort.solution(array, 6));
    }

    @Test
    public void test3() {
        int[] array = {-1, 0, 1};
        int[] expected = {}; // specs said nothing about negatives
        assertArrayEquals(expected, CountSort.solution(array, 1));
    }
}

