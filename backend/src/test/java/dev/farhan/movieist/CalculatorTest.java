package dev.farhan.movieist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import dev.farhan.movieist.movies.CalculatorService;

@SpringBootTest
class CalculatorTest {

	private final CalculatorService calculatorService = new CalculatorService();

	@Test
	public void testAdd() {
		int a = 5;
		int b = 3;
		int result = calculatorService.add(a, b);
		assertEquals(8, result);
	}

	@Test
	public void testSubtract() {
		int a = 5;
		int b = 3;
		int result = calculatorService.subtract(a, b);
		assertEquals(2, result);
	}

	@Test
	public void testAddWithNegativeNumbers() {
		int a = -5;
		int b = -3;
		int result = calculatorService.add(a, b);
		assertEquals(-8, result);
	}

	@Test
	public void testSubtractWithNegativeNumbers() {
		int a = -5;
		int b = -3;
		int result = calculatorService.subtract(a, b);
		assertEquals(-2, result);
	}

	@Test
	public void testAddWithZero() {
		int a = 0;
		int b = 5;
		int result = calculatorService.add(a, b);
		assertEquals(5, result);
	}

	@Test
	public void testSubtractWithZero() {
		int a = 0;
		int b = 5;
		int result = calculatorService.subtract(a, b);
		assertEquals(-5, result);
	}

}
