package ss9_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();
    // input 1,3 => 4
    @Test
    void sum1() {
       assertEquals(4,calculator.sum(1,3));
    }
    // input 0,0 =>0
    @Test
    void sum2() {
        assertEquals(0,calculator.sum(0,0));
    }
    // -1, -2
    @Test
    void sum3() {
        assertEquals(-3,calculator.sum(-1,-2));
    }

}