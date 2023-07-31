package com.cg.day2;

public class Operators {
	//arithmetic
	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("Add " +(a+b));
		System.out.println("Sub " +(a-b));
		System.out.println("Mul " +(a*b));
		System.out.println("Div " +(a/b));
		
	//relational
		int c=50,d=30;
	       if(c>d)
	    	   System.out.println(" c is greater");
	       else if(c==d)	   
	    	   System.out.println("c is equal to d");
	       else if(c<=d)
	    	   System.out.println("d is greater and equal to c");
	       else if(c>=d)
	    	   System.out.println("c is greater and equal to d");
	       
	// Assignment operators
	        int f = 7;
	        System.out.println("f += 3: " + (f += 3));
	        System.out.println("f -= 2: " + (f -= 2));
	        System.out.println("f *= 4: " + (f *= 4));
	        System.out.println("f /= 3: " + (f /= 3));
	        System.out.println("f %= 2: " + (f %= 2));
	        System.out.println("f <<= 2: " + (f <<= 2));
	        System.out.println("f >>= 1: " + (f >>= 1));
	        System.out.println("f >>>= 1: " + (f >>>= 1));
	       
	// Logical operators
	        boolean x = true;
	        boolean y = false;
	       
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));
	       
	}
	
}
