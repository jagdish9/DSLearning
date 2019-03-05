package com.java2.lambdaExpressions;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Printed inside Runnable.");
			}
			
		});
		
		thread.run();
		
		Thread lambdaThread = new Thread(() -> System.out.println("Printed inside lambda Runnable."));
		lambdaThread.run();
	}

}
