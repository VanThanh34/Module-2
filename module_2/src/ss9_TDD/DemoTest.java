package module_2.src.ss9_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    public void sum() throws Exception {
        int a = 2;
        int b  = 1;
        long result = demo.sum(a,b);
        assertEquals(3,result);
    }
    @Test
    public void sum1() throws Exception {
        int a = 2147483647;
        int b  = 1;
        long result = demo.sum(a,b);
        assertEquals(2147483648l,result);
    }
}