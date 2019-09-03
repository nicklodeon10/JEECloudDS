package com.cg.corejava.operators;

public class Exercise1 {

	public int getSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=Math.pow(rem, 3);
			n/=10;
		}
		return sum;
	}
	
}
