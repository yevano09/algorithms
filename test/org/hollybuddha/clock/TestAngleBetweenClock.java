package org.hollybuddha.clock;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAngleBetweenClock {

	@Test
	public void testAngleBetweenClock(){
		
		AngleBetweenClock clk = new AngleBetweenClock(12, 00);
		assertEquals(0.0, clk.anglebetween(), 0.5);
		
		clk = new AngleBetweenClock(9, 00);
		
		assertEquals(AngleBetweenClock.angle(9, 00) , clk.anglebetween() , 0.0);
		
		clk = new AngleBetweenClock(3, 00);
		assertEquals(90.0 , clk.anglebetween() , 0.0);

		
	}

}
