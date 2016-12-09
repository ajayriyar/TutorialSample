package com.tutorial.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {

	private int a=30;
	private int b=20;
	
	Calculator cal;

	@Before
	public void setUp(){
		cal = new Calculator();
	}
	
	@After
	public void tearDown() {
		cal=null;
	}
	
	@Test
	public void testSum() {
		int sum=30+20;
		assertEquals(sum, cal.sum(a, b));
		//fail("Not yet implemented");
	}

	@Test
	public void testSub() {
		int sum=30-20;
		assertEquals(sum, cal.sub(a, b));
	//	fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		int sum=30*20;
		assertEquals(sum, cal.multiply(a, b));
		//fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		int sum=30+20;
		assertEquals(sum, cal.divide(a, b));
		//fail("Not yet implemented");
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivide1() {
		int sum=30+20;
		assertEquals(sum, cal.divide(a, 0));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testMulitipy2() {
		Calculator test = Mockito.mock(Calculator.class);

        // define return value for method getUniqueId()
		Mockito.when(test.multiply(a, b)).thenReturn(50);

        // use mock in test....
        assertEquals(test.multiply(a,b), 5);
	}
}
