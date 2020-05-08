package com.tsr.predicate;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> validate = I -> I>10;
		
		System.out.println(validate.test(50));
		System.out.println(validate.test(5));
	}

}
