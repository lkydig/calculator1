package com.lkydig.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/** this is public */
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(4, calculator.sum(1, 3));
	}
}
