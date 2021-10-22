package com.mycompany.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PostfixTest {
    
    
    @Test
    public void test1() {
        Postfix pf = new Postfix("234*+");
        int result = pf.evalPostfix();
        assertEquals(10, result);
    }
    
    @Test
    public void test2() {
        Postfix pf = new Postfix("236*+");
        int result = pf.evalPostfix();
        assertEquals(12, result);
    }
    
    @Test
    public void test3() {
        Postfix pf = new Postfix("822/+");
        int result = pf.evalPostfix();
        assertEquals(6, result);
    }
    
    @Test
    public void test4() {
        Postfix pf = new Postfix("523-*");
        int result = pf.evalPostfix();
        assertEquals(9, result);
    }
    
    @Test
    public void test5() {
        Postfix pf = new Postfix("236+*");
        int result = pf.evalPostfix();
        assertEquals(30, result);
    }
}
