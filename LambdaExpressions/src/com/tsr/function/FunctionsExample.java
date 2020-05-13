package com.tsr.function;

import java.util.function.Function;

public class FunctionsExample {

	public static void main(String[] args) {
		String value  ="Testing length";
		
		Function<String, Integer> space = val -> val.length();
		Function<String, String> rmSpace = val -> val.replaceAll(" ", "");
		
		System.out.println(space.apply(value));
		System.out.println(rmSpace.apply(value));
	}
}
