package com.cg.corejava.multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exercise1 extends Thread{

	FileInputStream fileinp;
	FileOutputStream fileout;
	public Exercise1(FileInputStream fileinp, FileOutputStream fileout) {
		super();
		this.fileinp = fileinp;
		this.fileout = fileout;
	}
	
	public void run() {
		int a=0;
		int count=0;
		try {
			while(!((a=fileinp.read())<0)) {
				char c=(char)a;
				fileout.write(c);
				count++;
				if(count==10) {
					System.out.println("10 characters are copied");
					count=0;
					Thread.sleep(5000);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
