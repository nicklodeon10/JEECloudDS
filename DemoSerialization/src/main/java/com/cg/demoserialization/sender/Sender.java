package com.cg.demoserialization.sender;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.cg.demoserialization.data.Person;

public class Sender {

	public static void main(String[] args) throws IOException {
		
		Person person=new Person("Devang","Singh","gcwps","324873423");
		
		File file=new File("save.person");
		OutputStream outStream=new FileOutputStream(file);
		ObjectOutputStream objOutStream=new ObjectOutputStream(outStream);
		objOutStream.writeObject(person);
		System.out.println("Sent.");
		objOutStream.close();
		outStream.close();
	}

}
