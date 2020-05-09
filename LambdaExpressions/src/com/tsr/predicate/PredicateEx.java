package com.tsr.predicate;

import java.util.function.Predicate;

public class PredicateEx {

	public static void m2(Predicate<String> cond,String[] values) {
		for(String value:values) {
			if(cond.test(value)) {
				System.out.print(value);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		String[] names = {"sai","Karimulla","Bhargav","Jaga","siva",null};
		
		Predicate<String> condiPredicate1 = val -> val.toLowerCase().startsWith("s");
		Predicate<String> condiPredicate2 = val -> (null!=val && !val.trim().equals(""));
		
		System.out.println("Names starting with s");
		m2(condiPredicate2.and(condiPredicate1),names);
	}

}
