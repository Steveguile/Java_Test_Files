package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.Fish;

public class FishTest {

    @Test 
    public void test1() {
        int fish[] = {4, 3, 2, 1, 5};
        int direction[] = {0, 1, 0, 0, 0};
        assertEquals(2, Fish.solution(fish, direction));
    }

    @Test 
    public void test2() {
        int fish[] = {0, 1};
        int direction[] = {1, 1};
        assertEquals(2, Fish.solution(fish, direction));
    }

}
