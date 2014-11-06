package org.hollybuddha.collections;

import static org.junit.Assert.*;
import jdk.nashorn.internal.objects.annotations.Setter;

import org.junit.Test;

public class MultiValueMapArrayListTest {
	
	 

	@Test
	public void testHashCode() {
		MultiValueMap<String , String> mV= new MultiValueMapArrayList<String, String>();
		mV.put("1", "Name");
		mV.put("1", "two");
		System.out.println("mv.get = "+ (  mV.get("1").getClass().getName()));
		fail("Not yet implemented");
	}

	@Test
	public void testPut() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeySet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testContainsValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testValues() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
