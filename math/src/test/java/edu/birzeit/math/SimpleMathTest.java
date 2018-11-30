package edu.birzeit.math;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class SimpleMathTest extends TestCase {

	static SimpleMath simpleMath;

	public SimpleMathTest() {
		simpleMath = new SimpleMath();
	}

	@Test
	public void testSum() {
		int result = simpleMath.add(10, 10);
		assertEquals(20, result);

	}

	@Test
	public void testSumIntegerDouble() {
		@SuppressWarnings("static-access")
		Double result = simpleMath.add(10.5, 10.5);
		assertEquals(21.0, result);

	}
	
	@Test
    public void testSinX_hadiAwad() {
        assertEquals(0, simpleMath.sinX_hadiAwad(0));
        assertEquals(1, simpleMath.sinX_hadiAwad(90));
        assertEquals(0, simpleMath.sinX_hadiAwad(180));
        assertEquals(-1, simpleMath.sinX_hadiAwad(270));
        assertEquals(0, simpleMath.sinX_hadiAwad(360));
    }

	@Test
	public void testFactorial_lena() {
		assertEquals( 6, simpleMath.factorial_lena(3));
		assertEquals( 120.0, simpleMath.factorial_lena(5));
	}

	@Test
    public void testDiv_layalizidan() {
        assertEquals( 2.0, simpleMath.division_layalizidan(10.0, 5));
        assertEquals( 2.0, simpleMath.division_layalizidan(10, 5));
    }
	
	@Test
    public void testSquareRoot_BaraaAyyash() {
        assertEquals(3.0, simpleMath.squareRoot_BaraaAyyash(9));
        assertEquals( 2.0, simpleMath.squareRoot_BaraaAyyash(4));
    }
	@Test
	public void testSubtractInteger() {
		
		int result = simpleMath.subtract_Samaher(30, 10);
		assertEquals(20, result);
	}

	@Test
	public void testSubtractDouble() {

		Double result = simpleMath.subtract_Samaher(10.5, 0.5);
		assertEquals(10.0, result);

	}
}
