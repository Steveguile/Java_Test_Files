package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.MissingInteger;

public class MissingIntegerTest {

    @Test
    public void test1() {
        int[] array = {1, 3, 6, 4, 2, 1};
        assertEquals(5, MissingInteger.solution(array));
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3};
        assertEquals(4, MissingInteger.solution(array));
    }

    @Test
    public void test3() {
        int[] array = {-3, -1};
        assertEquals(1, MissingInteger.solution(array));
    }

}

