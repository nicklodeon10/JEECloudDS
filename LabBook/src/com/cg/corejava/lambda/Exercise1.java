package com.cg.corejava.lambda;

public class Exercise1 {
	public void lambdaPower(int x , int y) {
		Power a = (num1,num2)->Math.pow(num1,num2);
		System.out.println(a.power(x, y));
	}
}

interface Power{
	public double power(int x, int y);
}
