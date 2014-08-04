package org.hollybuddha.java8;

public interface extInterfacefromDefault {
	
	default String addStr(String a, String b ) {
		return a+b+" hi - ";
	}
	

}
