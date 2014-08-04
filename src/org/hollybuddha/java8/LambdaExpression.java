package org.hollybuddha.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
		  
	    interface IntegerMath {
	        int operation(int a, int b);   
	    }
	  
	    public int operateBinary(int a, int b, IntegerMath op) {
	        return op.operation(a, b);
	    }
	 
	    public static void main(String... args) {
	    
	        LambdaExpression myApp = new LambdaExpression();
	        IntegerMath addition = (a, b) -> a + b;
	        IntegerMath subtraction = (a, b) -> a - b;
	        IntegerMath multiply = (a, b) -> a + b;
	        IntegerMath devide = (a, b) -> a / b;
	        IntegerMath modulus = (a, b) -> a % b;
	        
	        System.out.println("20 + 10 = " +
	            myApp.operateBinary(20, 10, addition));
	        System.out.println("20 - 10 = " +
	            myApp.operateBinary(20, 10, subtraction));
	        System.out.println("20 * 10 = " +
		            myApp.operateBinary(20, 10, multiply));
	        System.out.println("20 / 10 = " +
		            myApp.operateBinary(20, 10, devide) );
	        System.out.println("21 / 10 = " +
		            myApp.operateBinary(21, 10, modulus) );
	        
	        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
	        list.stream().map((x) -> x*x).forEach(System.out::println);
	        
	    }
	

}
