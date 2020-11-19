package testcasesCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import uebung3.Calculator;

public class CalculatorTest {

	@Test
	public void testIntegerAddition() {
		Calculator calc = new Calculator();
		int sum1 = calc.integerAddition(1, 1);
		int sum2 = calc.integerAddition(1, -2);
		int sum3 = calc.integerAddition(0, 1);

		assertEquals(2, sum1);
		assertEquals(-1, sum2);
		assertEquals(1, sum3);
	}

	@Test
	public void testIntegerSubtraction() {
		Calculator calc = new Calculator();
		int dif1 = calc.integerSubtraction(2, 1);
		int dif2 = calc.integerSubtraction(4, -6);
		int dif3 = calc.integerSubtraction(-2, 4);
		int dif4 = calc.integerSubtraction(-1, -2);

		assertEquals(1, dif1);
		assertEquals(10, dif2);
		assertEquals(-6, dif3);
		assertEquals(1, dif4);
	}

	@Test
	public void testIntegerMultiplication() {
		Calculator calc = new Calculator();
		int prod1 = calc.integerMultiplication(2, 2);
		int prod2 = calc.integerMultiplication(2, -2);
		int prod3 = calc.integerMultiplication(0, 3);
		int prod4 = calc.integerMultiplication(-3, -2);

		assertEquals(4, prod1);
		assertEquals(-4, prod2);
		assertEquals(0, prod3);
		assertEquals(6, prod4);
	}

	@Test
	public void testIntegerDivision() {
		Calculator calc = new Calculator();
		int quot1 = calc.integerDivision(2, 2);
		int quot2 = calc.integerDivision(2, -2);
		int quot3 = calc.integerDivision(-4, -2);
		int quot4 = calc.integerDivision(0, 1);
		
		assertEquals(1, quot1);
		assertEquals(-1, quot2);
		assertEquals(2, quot3);
		assertEquals(0, quot4);
	}

	@Test(expected = ArithmeticException.class)
	public void testIntegerDivisionByZero() {
		Calculator calc = new Calculator();
		int quot5 = calc.integerDivision(10, 0);
	}

}
