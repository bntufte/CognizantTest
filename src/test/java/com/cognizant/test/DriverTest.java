package com.cognizant.test;

import static org.junit.Assert.*;
import org.junit.*;
import com.cognizant.Driver;

public class DriverTest {		
		
	@Test
	public void testDriverValidateInputNumberTooLarge() {		
		assertFalse(Driver.validateInput("22"));
	}
	
	@Test
	public void testDriverValidateInputNumberIsNegative() {		
		assertFalse(Driver.validateInput("-1"));
	}
	
	@Test
	public void testDriverValidateInputNotANumber() {		
		assertFalse(Driver.validateInput("word"));
	}
	
	@Test
	public void testDriverValidateInputInRange() {		
		assertTrue(Driver.validateInput("5"));
	}
	
	@Test
	public void testDriverProcessInput0() {		
		assertEquals(0, Driver.processInput("0"));
	}
	
	@Test
	public void testDriverProcessInput1() {		
		assertEquals(0, Driver.processInput("1"));
	}
	
	@Test
	public void testDriverProcessInput2() {		
		assertEquals(1, Driver.processInput("2"));
	}
	
	@Test
	public void testDriverProcessInput5() {		
		assertEquals(1, Driver.processInput("5"));
	}
	
	@Test
	public void testDriverProcessInput12() {		
		assertEquals(2, Driver.processInput("12"));
	}
	
	@Test
	public void testDriverProcessInput20() {		
		assertEquals(3, Driver.processInput("20"));
	}
	
	@Test
	public void testDriverProcessInput21() {		
		assertEquals(4, Driver.processInput("21"));
	}
	
	@Test
	public void testDriverProcessInput22() {		
		assertEquals(6, Driver.processInput("22"));
	}
	
	
}
