package com.tw.oops;

import org.junit.Rule;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class TestDivide {

    @Test
    public void testDivide6By3() throws Exception {
        Divide divide = new Divide();
        assertEquals(2, divide.doOperation(6,3));
    }

    @Test
    public void testDivideSomeLongNumbers() throws Exception {
        Divide divide = new Divide();
        assertEquals(1000000, divide.doOperation(1222000000,1222));
    }

    @Test
    public void testDividedBy0() throws Exception {
        Divide divide = new Divide();
        assertEquals(divide.doOperation(6,0), divide.doOperation(8,0));
    }

}
