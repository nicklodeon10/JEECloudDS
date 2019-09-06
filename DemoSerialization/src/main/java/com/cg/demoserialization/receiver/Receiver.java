package com.cg.demoserialization.receiver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.cg.demoserialization.data.Person;

public class Receiver {

	public static void main(String args[])throws IOException, ClassNotFoundException {
		
		File file=new File("save.person");
		InputStream inStream=new FileInputStream(file);
		ObjectInputStream objInStream=new ObjectInputStream(inStream);
		Person person=(Person)objInStream.readObject();
		System.out.println(person);
		objInStream.close();
		inStream.close();
		
	}
	
}
