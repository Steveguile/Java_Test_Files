package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.OddOccurencesInArray;

public class OddOccurencesInArrayTest {

    @Test
    public void test1() {
        int[] array = {9, 3, 9, 3, 9, 7, 9};
        assertEquals(7, OddOccurencesInArray.solution(array));
    }
}

