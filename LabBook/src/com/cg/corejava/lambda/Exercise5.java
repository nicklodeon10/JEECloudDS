package com.cg.corejava.lambda;

import java.util.Scanner;

interface Factorial {
	public int cal(int num);
}

public class Exercise5 {

	public int factorial(int num) {
		int temp = 1;
		while (num > 0) {
			temp = temp * num;
			num--;
		}
		return temp;
	}

	public static void main(String[] args) {
		Factorial fact = new Exercise5()::factorial;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println(fact.cal(num));
		sc.close();
	}
}
