package com.java2.johnson;

class EvenOddInAscending implements Runnable{
	private ShowClass showClass;
	private boolean isEven;
	
	EvenOddInAscending(ShowClass showClass, boolean isEven){
		this.showClass = showClass;
		this.isEven = isEven;
	}
	
	public void run(){
		int number = isEven == true ? 2 : 1;
		while(number <= 100){
		if(isEven){
			showClass.printEven(number);
		}else{
			showClass.printOdd(number);
		}
	  	number += 2;
	  }
	}
}

class ShowClass{
	
	boolean isOdd = false;
	
	
	public synchronized void printEven(int number){
		while(isOdd = false){
			try{
				wait();
			}
			catch(InterruptedException is){
				is.printStackTrace();
			}
		}
		System.out.print(number+" ");
		isOdd = false;
		notifyAll();
	}
	
	public synchronized void printOdd(int number){
		while(isOdd == true){
			try{
				wait();
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
		System.out.print(number+" ");
		isOdd = true;
		notifyAll();
	}

}

public class EvenOddNumbersDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowClass showClass = new ShowClass();
		Thread t1 = new Thread(new EvenOddInAscending(showClass, false));
		Thread t2 = new Thread(new EvenOddInAscending(showClass, true));
		t1.start();
		t2.start();
	}
	
	

}
