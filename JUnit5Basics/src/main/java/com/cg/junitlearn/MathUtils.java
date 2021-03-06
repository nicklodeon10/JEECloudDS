package com.cg.junitlearn;

public class MathUtils {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public float divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Cannot Divide by Zero.");
		}else {
			return (float)a/b;
		}
	}
	
	public double computeCircleRadius(int r) {
		return Math.PI*r*r;
	}
	
}
