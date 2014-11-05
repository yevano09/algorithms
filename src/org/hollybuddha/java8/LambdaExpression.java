package org.hollybuddha.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.hamcrest.core.AnyOf;

public class LambdaExpression {
		  
	    interface IntegerMath {
	        int operation(int a, int b);   
	    }
	  
	    public int operateBinary(int a, int b, IntegerMath op) {
	        return op.operation(a, b);
	    }
	    
	    public static void filter ( List<String> listofAny, Predicate<String> condition) {
	    	
	    	for(String s: listofAny ) {
	    		if(condition.test(s)){
	    			System.out.println(" "+s);
	    		}
	    	}
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
	        list.stream().map((x) -> x*x).forEach( n -> System.out.print(n +" " ));
	        List<String> lstOfString =  Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
	        System.out.println(" The Programming langauage list :");
	        filter( lstOfString, str -> str.contains("a"));
	        
	     // New way:
	        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
	        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
	        System.out.println("Total : " + bill);




	        
	    }
	

}
