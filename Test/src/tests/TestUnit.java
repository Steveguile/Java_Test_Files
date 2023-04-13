package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.Worksheet;

public class TestUnit {
 
    @Test
    public void test1() {
        int[] array = {1, 3, 1, 4, 2, 3, 5, 4};
        assertEquals(6, Worksheet.solution(5, array));
    }
}

