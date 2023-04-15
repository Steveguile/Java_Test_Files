package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.PassingCars;

public class PassingCarsTest {
 
    @Test
    public void test1() {
        int[] array = {0, 1, 0, 1 ,1};
        assertEquals(5, PassingCars.solution(array)); // (0, 1), (0, 3), (0, 4), (2, 3), (2, 4)
    }
}

