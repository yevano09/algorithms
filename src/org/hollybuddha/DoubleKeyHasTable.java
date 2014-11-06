package org.hollybuddha;

import org.apache.commons.collections4.map.MultiValueMap;

public class DoubleKeyHasTable {
	

	MultiValueMap<String, String> myMap = new MultiValueMap<String, String>(); 
	/**
	 *  constructor for the double key hash table
	 *  
	 */
	public DoubleKeyHasTable() {
		
		myMap.put("1", "one");
		myMap.put("1", "two");
		myMap.put("1", "three");
	
	}
	
	
	public static void main(String...args ) {
		
		MultiValueMap<String, String> myMap = new MultiValueMap<String, String>();
		myMap.put("1", "one");
		myMap.put("1", "two");
		myMap.put("1", "three");
		
		System.out.println(myMap.get("1"));
	}

}
