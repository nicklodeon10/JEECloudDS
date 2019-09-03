package com.cg.corejava.classes;

public class Exercise4 {

	public boolean checkNumber(int n) {
		int i;
		for(i=2; i<=n; i=i*2);
		if(i/2==n && n!=1) return true;
		return false;
	}
	
}
