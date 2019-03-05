package com.java.executor;

public class WorkerThread implements Runnable {

	private int workerNumber;
	
	WorkerThread(int number)
	{
		workerNumber = number;
	}
	
	public void run()
	{
		for(int i = 0; i<= 100; i+=20)
		{
			System.out.println("Worker number: " + workerNumber
	                + ", percent complete: " + i +" Completed by "+Thread.currentThread().getName());
	            try 
	            {
	                Thread.sleep((int)(Math.random() * 1000));
	            } 
	            catch (InterruptedException e) 
	            {
	            	e.printStackTrace();
	            }
		}
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         