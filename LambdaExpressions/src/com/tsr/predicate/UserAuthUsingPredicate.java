package com.tsr.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	 String name;
	
	 String pass;
	
	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	
}
public class UserAuthUsingPredicate {

	private static Predicate<User> predicate = user -> user.name.equals("test") && user.pass.equals("java");
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User Name:");
		String name = sc.next();
		System.out.println("Password:");
		String pass = sc.next();
		User user = new User(name, pass);
		if(predicate.test(user)) {
			System.out.println("Success Login");
		}else {
			System.out.println("Try Again...");
		}	
		sc.close();
	}

}
