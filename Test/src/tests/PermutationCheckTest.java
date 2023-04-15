package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.PermutationCheck;

public class PermutationCheckTest {

    @Test
    public void test1() {
        int[] array = {4, 1, 3, 2};
        assertEquals(1, PermutationCheck.solution(array));
    }

    @Test
    public void test2() {
        int[] array = {4, 1, 3};
        assertEquals(0, PermutationCheck.solution(array));
    }

    @Test
    public void test3() {
        int[] array = {1, 1, 4, 1}; // Not a permutation: missing 2, 3
        assertEquals(0, PermutationCheck.solution(array));
    }

    @Test
    public void test4() {
        int[] array = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8}; // Not a permutation: missing 4
        assertEquals(0, PermutationCheck.solution(array));
    }
}

