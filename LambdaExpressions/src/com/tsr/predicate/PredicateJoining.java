package com.tsr.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void m1(Predicate<Integer> pre,int[] array) {
		for(Integer val:array) {
			if(pre.test(val))
				System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] array = {0,5,10,15,20,25,30,40,45,50};
		
		Predicate<Integer> condition1 = val -> val>10;
		Predicate<Integer> condition2 = val -> val%2==0;
		
		System.out.println("The Numbers greated than 10 are:");
		m1(condition1, array);
		
		System.out.println("The Even Numbers:");
		m1(condition2,array);
		
		System.out.println("Numbers not greater than 10");
		m1(condition1.negate(),array);
		
		System.out.println("Number Greater than 10 and even numbers are:");
		m1(condition1.and(condition2),array);
		
		System.out.println("Numbers Greater than 10 or even numbers are:");
		m1(condition1.or(condition2),array);
	}

}
