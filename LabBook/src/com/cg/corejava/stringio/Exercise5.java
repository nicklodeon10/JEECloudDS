package com.cg.corejava.stringio;

public class Exercise5 {

	public boolean isPositive(String s) {
		int n = s.length();

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) < s.charAt(i - 1))
				return false;
		}

		return true;
	}

}
