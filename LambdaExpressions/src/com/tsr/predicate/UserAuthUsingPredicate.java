package com.tsr.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	 String name;
	
	 String pass;
	 
	 boolean isActive;
	
	public User(String name, String pass,boolean isActive) {
		super();
		this.name = name;
		this.pass = pass;
		this.isActive = isActive;
	}
	
}
public class UserAuthUsingPredicate {

	private static Predicate<User> predicate = user -> user.name.equals("test") && 
													   user.pass.equals("java") &&
													   user.isActive;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User Name:");
		String name = sc.next();
		System.out.println("Password:");
		String pass = sc.next();
		System.out.println("Is Active:");
		String activeStatus = sc.next();
		User user = new User(name, pass,Boolean.parseBoolean(activeStatus));
		if(predicate.test(user)) {
			System.out.println("Success Login");
		}else {
			System.out.println("Try Again...");
		}	
		sc.close();
	}

}
