package com.qa;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Assert;


public class Testing {
	
	Watch wat = new Watch();
	
	@Test
	public void testInput() {
		wat.terrainWatch();
		double expected = 5.0;
		
				
		assertEquals(expected, "");
	}
	
	@Test
	public void test2() {
		assertEquals("", "");
	}
	
	@Test
	public void test3() {
		
		String res = null;
		String expected = null;
		assertTrue("", res.equals(expected));
	}

	@Test
	public void test4() {
		Math.hypot(2,4);
		String res = null;
		String expected = null;
		assertFalse("", !(res.equals(expected)));
	}
	
}
