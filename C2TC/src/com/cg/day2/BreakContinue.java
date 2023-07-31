package com.cg.day2;

public class BreakContinue {

	public static void main(String[] args) {
		// Break
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		System.out.println("===========");
		//Continue
		int n = 0;
           while (n < 10) {
	        if (n == 4) {
	        n++;
	        continue;
	  }
	    System.out.println(n);
	    n++;
	}
}
}