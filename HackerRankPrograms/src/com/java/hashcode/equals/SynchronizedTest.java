package com.java.hashcode.equals;

public class SynchronizedTest {

	private String name;
	
	public SynchronizedTest(String name) {
		super();
		this.name = name;
	}

	public static synchronized void staticSynchMethod(){
			System.out.println("SM1 ");
			System.out.println("SM2 ");
	}
	
	public synchronized void synchMethod(){
		System.out.println(name +" M1");
		System.out.println(name +" M2");
}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SynchronizedTest o1 = new SynchronizedTest("o1");
		
		Thread t1 = new Thread(){
			public void run(){
				o1.synchMethod();
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				staticSynchMethod();
			}
		};
		
		Thread t3 = new Thread(){
			public void run(){
				staticSynchMethod();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}

}
