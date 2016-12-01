package com.java.practice;

public class InvokingDynamicExample {

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> System.out.println("running thread 1"));
		/*Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("running thread 1");
				
			}
		});*/
		thread1.start();

	}

}
