package com.java2.sutherlnd;

public class AutoBoxing {

	public void addShort(short s){
		
	}
	
	public void addInt(int i){
		
	}
	
	public void addLong(long l){
		
	}
	
	public static void main(String[] args){
	
		AutoBoxing ab = new AutoBoxing();
	//	ab.addShort(7); upper to lower conversion is not possible in java
		ab.addInt(9);
		ab.addLong(12);
		
		short s1 = 17;
		ab.addShort(s1);
		int i1 = 23;
		//ab.addShort(i1);  //compile time error
		short s2 = (short)i1;
		ab.addShort(s2);
		
		int i2 = 25;
		int i3 = s1;
		ab.addInt(i3);
		
		long l1 = 14;
		ab.addLong(l1);
		
		i1 = (int)l1; // upper to lower casting so it rquired for explicit conversion
		ab.addInt(i1);
		
		l1 = i1;
		ab.addLong(l1);
	}
}
