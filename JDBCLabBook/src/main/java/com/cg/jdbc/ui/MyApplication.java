package com.cg.jdbc.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.cg.jdbc.dto.Author;
import com.cg.jdbc.service.AuthorService;
import com.cg.jdbc.service.AuthorServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		AuthorService authorService=new AuthorServiceImpl();
		int choice=0;
		do {
			System.out.println("Enter 1 to Add.");
			System.out.println("Enter 2 to Find.");
			System.out.println("Enter 3 to Update.");
			System.out.println("Enter 4 to Delete.");
			choice=scanner.nextInt();
			switch(choice){
				case 1:{
					System.out.print("Enter First Name: ");
					String fname=scanner.next();
					System.out.print("Enter Middle Name: ");
					String mname=scanner.next();
					System.out.print("Enter Last Name: ");
					String lname=scanner.next();
					System.out.print("Enter Phone Number: ");
					BigInteger phNo=scanner.nextBigInteger();
					Author author=new Author();
					author.setFirstName(fname);
					author.setMiddleName(mname);
					author.setLastName(lname);
					author.setPhoneNo(phNo);
					authorService.addAuthor(author);
					break;
				}case 2:{
					System.out.print("Enter Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					System.out.println(authorService.findAuthor(authorId));
					break;
				}case 3:{
					System.out.print("Enter Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					System.out.print("Enter First Name: ");
					String fname=scanner.next();
					System.out.print("Enter Middle Name: ");
					String mname=scanner.next();
					System.out.print("Enter Last Name: ");
					String lname=scanner.next();
					System.out.print("Enter Phone Number: ");
					BigInteger phNo=scanner.nextBigInteger();
					Author author=new Author();
					author.setAuthorId(authorId);
					author.setFirstName(fname);
					author.setMiddleName(mname);
					author.setLastName(lname);
					author.setPhoneNo(phNo);
					System.out.println(authorService.updateAuthor(author));
					break;
				}case 4:{
					System.out.print("Enter Author Id: ");
					BigInteger authorId=scanner.nextBigInteger();
					System.out.println(authorService.deleteAuthor(authorId));
					break;
				}
			}
		}while(choice!=0);
		scanner.close();
	}

}
