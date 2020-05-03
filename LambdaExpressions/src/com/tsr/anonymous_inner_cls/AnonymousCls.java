package com.tsr.anonymous_inner_cls;

public class AnonymousCls {
	
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Anonymous Thread Name:"+Thread.currentThread().getName());
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		}
	}

}
