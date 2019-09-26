package com.cg.corejava.lambda;

public class Exercise2 {
	public void printStringWithSpace(String s) {
		SplitString str = (st) -> {
			String[] myStr = st.split("");
			String out = "";
			for (int i = 0; i < myStr.length; i++) {
				out += myStr[i] + " ";
			}
			System.out.println(out);
		};
		str.splitString(s);
	}
}

interface SplitString {
	public void splitString(String s);
}