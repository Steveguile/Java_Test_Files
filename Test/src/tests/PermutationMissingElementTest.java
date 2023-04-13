package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.PermutationMissingElement;

public class PermutationMissingElementTest {

    @Test
    public void test1() {
        int[] array = {2, 3, 1, 5};
        assertEquals(4, PermutationMissingElement.solution(array));
    }
}

