package com.cg.corejava.multithreading;

import java.time.LocalTime;

public class Exercise2 {

	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
	}
	
}
