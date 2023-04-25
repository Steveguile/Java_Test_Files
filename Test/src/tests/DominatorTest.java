package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.Dominator;;

public class DominatorTest {

    @Test 
    public void test1() {
        int[] input = {3, 4, 3, 2, 3, -1, 3, 3};
        assertEquals(0, Dominator.solution(input)); // 2, 4, 6, 7 would work just return first
    }

    @Test 
    public void test2() {
        int[] input = {4, 4, 1, 2, 2, -1, 3, 3};
        assertEquals(-1, Dominator.solution(input));
    }

}
