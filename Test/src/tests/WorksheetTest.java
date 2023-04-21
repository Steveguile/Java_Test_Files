package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.Worksheet;

public class WorksheetTest {

    @Test 
    public void test1() {
        assertEquals(1, Worksheet.solution("[()]"));
    }

    @Test 
    public void test2() {
        assertEquals(0, Worksheet.solution("[(()]"));
    }

    @Test 
    public void test3() {
        assertEquals(0, Worksheet.solution("[())]"));
    }

    @Test 
    public void test4() {
        assertEquals(1, Worksheet.solution(""));
    }

    @Test 
    public void test5() {
        assertEquals(0, Worksheet.solution("}]][[{"));
    }

    @Test 
    public void test6() {
        assertEquals(1, Worksheet.solution("()[]"));
    }

    @Test 
    public void test7() {
        assertEquals(0, Worksheet.solution("([)()]"));
    }

    @Test
    public void test8() {
        assertEquals(1, Worksheet.solution("{[()()]}"));
    }

    @Test
    public void test9() {
        assertEquals(0, Worksheet.solution(")()"));
    }
    
}
