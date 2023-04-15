package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.CountDiv;

public class CountDivTest {
 
    @Test
    public void test1() {
        assertEquals(3, CountDiv.solution(6, 11, 2)); 
    }
    
    @Test
    public void test2() {
        assertEquals(1, CountDiv.solution(10, 10, 5)); 
    }
    
    @Test
    public void test3() {
        assertEquals(0, CountDiv.solution(10, 10, 7)); 
    }
    
    @Test
    public void test4() {
        assertEquals(0, CountDiv.solution(10, 10, 20)); 
    }

    // A = 6, B = 9, K = 3
    // [0, 0, 0, 0, 0, 1, 0, 0, 1]
    // A index = 5, B index = 8
    // floor(8/5) - floor(5/3) + (5 % 3 == 0 ? 1 : 0)
    // 1 - 1 + 2 = 2
    @Test
    public void test5() {
        assertEquals(2, CountDiv.solution(6, 9, 3)); 
    }
    
}

