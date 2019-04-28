package pl.edu.agh.mwo.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest{

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5, 7));
    }

    @Test (expected = Divide)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calcDivide(5, 0);
    }


}
