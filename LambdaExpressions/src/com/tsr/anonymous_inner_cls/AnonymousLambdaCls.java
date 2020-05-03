package com.tsr.anonymous_inner_cls;

public class AnonymousLambdaCls {

	public static void main(String[] args) {
		Runnable runnable = () ->{
			for(int i=0;i<5;i++)
				System.out.println("Thread from Lambda:"+Thread.currentThread().getName());
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println("Thread from Main:"+Thread.currentThread().getName());
		}
	}
}
