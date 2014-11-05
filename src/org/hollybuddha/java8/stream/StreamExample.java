package org.hollybuddha.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1", "bc","clear", "carlson", "Carl");

			myList
			    .stream()
			    .filter(s -> !s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(n -> System.out.print(n + " "));

	}

}
