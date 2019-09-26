package com.cg.corejava.lambda;

import java.util.Scanner;

public class Exercise3 {

	public void validateNamePass() {
		String uname = "Saumya";
		String pass = "lns123";
		Validate val = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your username: ");
			String name = sc.next();
			System.out.println("Enter your password: ");
			String password = sc.next();
			sc.close();
			if (uname.equals(name))
				if (pass.equals(password))
					return true;
				else
					return false;
			else
				return false;
		};
		System.out.println(val.validate());
	}

}

interface Validate {
	public boolean validate();
}