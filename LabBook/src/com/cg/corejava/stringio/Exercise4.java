package com.cg.corejava.stringio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise4 {

	public void readFile() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("E:\\Project\\CoreJavaLabEight\\src\\test.txt"));
			String nextLine = reader.readLine();
			int lineNo = 1;
			while (nextLine != null) {
				System.out.println(lineNo + ". " + nextLine);
				nextLine = reader.readLine();
				lineNo++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fileOptions(String s) {
		File file = new File(s);
		if (file.exists()) {
			System.out.println("File Exists");
			if (file.canRead()) {
				System.out.println("File is readable");
			}
			if (file.canWrite()) {
				System.out.println("File is writable");
			}
			if (s.lastIndexOf(".") != -1 && s.lastIndexOf(".") != 0)
				System.out.println("FIle type is : " + s.substring(s.lastIndexOf(".") + 1));
			else
				System.out.println("File type is : nothing");
			System.out.println("File size : " + file.length() + " Bytes");
		} else {
			System.out.println("File does not Exist");
		}
	}
	
}
