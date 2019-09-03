package com.cg.corejava.classes;

public class Exercise2 {

	public int calculateDifference(int n) {
		return ((n*(n+1)*(2*n+1))/6)- (int)Math.pow(((n*(n+1))/2), 2) ;// n(n+1)(2n+1)/6
	}
	
}
