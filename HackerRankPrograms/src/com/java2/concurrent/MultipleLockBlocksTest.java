package com.java2.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLockBlocksTest {

	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	public synchronized void stageOne(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list1.add(random.nextInt(100));
	}
	
	public synchronized void stageTwo(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list2.add(random.nextInt(100));
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

/*we have used synchronized keyword with the method stageOne() and stageTwo(), with this keyword it creates the intrinsic lock (aka monitor lock)
of the object here MultipleLockBlocksTest. means if one thread is executing stageOne() method another thread has to wait to execute stageOne(), and also 
since it has done intrinsic lock, if one thread is executing stageOne() (it has locked the object), another thread has to wait to execute stageTwo() aslo,
and vice versa in case of stageTwo().
This is not good, it takes more time, execute and see the time taken, it is taking 4 seconds with synchronized keyword.
-- Only one thread can execute any one mthod of above class
go for solution MultipleLockBlocksTestSolution
*/