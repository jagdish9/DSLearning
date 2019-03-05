package com.java2.concurrent;

public class SynchronizedTest {

	private int count = 0;
	
	public static void main(String[] args) {
		SynchronizedTest st = new SynchronizedTest();
		st.doWork();
	}
	
	public void doWork(){
		Thread t1 = new Thread(new Runnable(){

			public void run() {
				
				for(int i = 1; i <= 20000; i++){
					count++;
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			public void run() {
				
				for(int i = 1; i <= 20000; i++){
					count++;
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

//It should print count vale 40000 but it is not printing, there is some issue with this code the solution is in SynchronizedTestSolution class.
