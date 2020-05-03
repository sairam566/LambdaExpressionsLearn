package com.tsr.anonymous_inner_cls;

interface Test1{
	abstract void m1();
}

public class AnonymousLambdaClsVarAccess {

	int x = 566;
	public void m2() {
		Test1 test = ()->{
			int x=666;
			System.out.println(x);
		};
		test.m1();
	}
	public static void main(String[] args) {
		AnonymousLambdaClsVarAccess access = new AnonymousLambdaClsVarAccess();
		access.m2();
	}
}
