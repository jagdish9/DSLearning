package com.java2.concurrent;

import java.util.Scanner;

class ProcessorProblem{
	
	public void produce() throws InterruptedException{
		synchronized(this){
			System.out.println("Producer thread running.....");
			wait();
			System.out.println("Resumed.");
		}
	}
	
	public void consume() throws InterruptedException{
		Scanner scan = new Scanner(System.in);
		Thread.sleep(2000);
		
		synchronized(this){
			System.out.println("Waiting for return key.");
			scan.nextLine();
			System.out.println("Return key pressed.");
			notify();
			Thread.sleep(5000);
		}
		
		scan.close();
	}
}

public class WaitAndNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ProcessorProblem processorPblm = new ProcessorProblem();
		
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				try{
					processorPblm.produce();
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				try{
					processorPblm.consume();
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try{
		   t1.join();
		   t2.join();
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
	}
	


}
