package com.tsr.anonymous_inner_cls;


interface Test{
	abstract void m1();
}

public class AnonymousClsVarAccess {
	
	int x=566;
	public void m2() {
		Test test = new Test() {
			int x=666;
			public void m1() {
				System.out.println(this.x);//666
			}
		};
		test.m1();
	}
	public static void main(String[] args) {
		
		AnonymousClsVarAccess access = new AnonymousClsVarAccess();
	
		access.m2();
	}
}
