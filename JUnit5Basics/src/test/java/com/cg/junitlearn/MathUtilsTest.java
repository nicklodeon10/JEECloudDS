package com.cg.junitlearn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathutils;
	
	@BeforeEach
	void init() {
		mathutils=new MathUtils();
	}
	
	@Test
	void testAdd() {
		int expected=2;
		int actual=mathutils.add(1, 1);
		assertEquals(expected, actual, "Add method should add two numbers.");
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathutils.divide(1, 0), "Divide by zero should throw.");
	}
	
	@Test
	void testComputeCircleRadius() {
		assertEquals(314.1592653589793, mathutils.computeCircleRadius(10), "Should return correct circle area.");
	}
}
