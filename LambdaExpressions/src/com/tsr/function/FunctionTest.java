package com.tsr.function;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<String, Integer> fun = s->s.length();
		
		System.out.println(fun.apply("test1"));
	}

}
