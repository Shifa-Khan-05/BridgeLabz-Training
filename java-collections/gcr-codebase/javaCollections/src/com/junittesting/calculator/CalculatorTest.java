package com.junittesting.calculator;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
  public void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
  public  void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
  public  void testMultiply() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
   public void testDivide() {
        assertEquals(4, calc.divide(8, 2));
    }

    @Test(expected = ArithmeticException.class)
   public void testDivideByZero() {
        calc.divide(10, 0);
    }

}
