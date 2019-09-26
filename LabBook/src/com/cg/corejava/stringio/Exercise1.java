package com.cg.corejava.stringio;

import java.util.StringTokenizer;

public class Exercise1 {

	public int sumOfInt(String line) {
		int sum = 0;
		StringTokenizer st = new StringTokenizer(line, ",");
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		return sum;

	}

}
