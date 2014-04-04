package org.hollybuddha.clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAngleBetweenClock {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAngleBetweenClock(){
		
		AngleBetweenClock clk = new AngleBetweenClock(10, 30);
		assertEquals(0.0, clk.anglebetween(), 0.5);
		
		clk = new AngleBetweenClock(12, 30);
		
		assertEquals(0.0, clk.anglebetween(), 0.5);
		
		clk = new AngleBetweenClock(4, 20);
		System.out.println(clk);

		clk = new AngleBetweenClock(2, 20);
		System.out.println(clk);
	}
	
	public static void main(String[] args) {

		

	}
}
