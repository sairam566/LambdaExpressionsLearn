package com.tsr.predicate;

import java.util.function.Predicate;

interface Direction{
	
}
class North implements Direction{
	
}
class South implements Direction{
	
}

public class PredicateIsEquals {

	private static North north = new North();
	
	private static Predicate<Direction> d1 = Predicate.isEqual(north);
	
	public static void main(String[] args) {
		
		if(d1.test(north)) {
			System.out.println("ok");
		}else {
			System.out.println("no match");
		}
	}

}
