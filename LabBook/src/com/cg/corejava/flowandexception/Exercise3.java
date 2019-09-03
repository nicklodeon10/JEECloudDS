package com.cg.corejava.flowandexception;

public class Exercise3 {

	public void printPrimes(int n) {
		for(int i=2; i<=n; i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	
	public boolean isPrime(int n) {
		int count=1;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) count++;
			if(count>=2) break;
		}
		if(count>=2) return false;
		return true;
	}
	
}
