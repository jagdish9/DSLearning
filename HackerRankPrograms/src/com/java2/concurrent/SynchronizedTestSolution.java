package com.java2.concurrent;

public class SynchronizedTestSolution {

	private int count = 0;
	
	public synchronized void increment(){
	    count++;	
	}
	
	public static void main(String[] args) {
		SynchronizedTestSolution st = new SynchronizedTestSolution();
		st.doWork();
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){

			public void run() {
				
				for(int i = 1; i <= 20000; i++){
					increment();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			public void run() {
				
				for(int i = 1; i <= 20000; i++){
					increment();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Count is "+count);
	}
	
}
