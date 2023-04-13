package tests;
import org.junit.Test;
import static org.junit.Assert.*;

import worksheet.worksheets.BinaryGap;

public class BinaryGapTest {

    @Test
    public void test1() {
        assertEquals(5, BinaryGap.solution(1041));
    }

    @Test
    public void test2() {
        assertEquals(0, BinaryGap.solution(32));
    }
}

