package com.cg.corejava.arrays;

import java.util.Arrays;

public class Exercise2 {

	public String[] getSortedStringWithCaseMod(String ar[]) {
		for(int i=0; i<ar.length; i++) {
			ar[i]=ar[i].toLowerCase();
		}
		Arrays.sort(ar);
		for(int i=0; i<Math.ceil(ar.length/2+1); i++) {
			ar[i]=ar[i].toUpperCase();
		}
		return ar;
	}
	
}
