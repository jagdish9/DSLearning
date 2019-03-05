package com.java2.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.java.thread.Example;

public class MultipleLockBlocksTestSolution {

	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	public void stageOne(){
		
		synchronized(lock1){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list1.add(random.nextInt(100));
		}
	}
	
	public void stageTwo(){
		
		synchronized(lock2){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list2.add(random.nextInt(100));
		}
	}
	
	public void process(){
		for(int i = 0; i < 1000; i++){
			stageOne();
			stageTwo();
		}
	}
	
	public void main(){
		System.out.println("Starting ...");
		
		long start = System.currentTimeMillis();
		
		//process(); we can uncomment and see the execution
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				process();
			}
		});
		

		Thread t2 = new Thread(new Runnable(){
			public void run(){
				process();
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
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: "+(end - start));
		
		System.out.println("List1: "+list1.size()+" List2: "+list2.size());
	}
	
}

/*with the synchrnozied block two threads can execute the differnte methods of the above class.
if one thread can enter exceute one and executing synchronized block(lock1), another thread can enter into lock1 
block but has to wait to execute becuase another thread is executing.
If one thread is executing stageOne(), anther thread can execute stageTwo() simultaeoulsy because intrinsic lock is differnet.
This is very good practise to lock this as above Example. 
It will take 2 seconds, execute and see*/