package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.EquiLeader;

public class EquiLeaderTest {

    @Test 
    public void test1() {
        int[] input = {4, 3, 4, 4, 4, 2};
        // (4) and (3, 4, 4, 4, 2)
        // (4, 3, 4) and (4, 4, 2)
        assertEquals(2, EquiLeader.solution(input)); 
    }

}
