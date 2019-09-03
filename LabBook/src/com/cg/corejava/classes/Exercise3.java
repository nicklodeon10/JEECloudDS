package com.cg.corejava.classes;

public class Exercise3 {
	
	public boolean checkNumber(int n) {
		int a=n%10;
		n/=10;
		int b=n%10;
		n/=10;
		while(n>0) {
			if((b-a)>0) { 
				return false;
			}
			a=b;
			b=n%10;
			n/=10;
		}
		return true;

	}
	
}
