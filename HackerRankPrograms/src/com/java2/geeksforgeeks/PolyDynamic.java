package com.java2.geeksforgeeks;

class ABC{
	   public void myMethod() throws Exception{
		System.out.println("ABC Method");
	   }
	   
	   public void myFunction() throws RuntimeException{
			System.out.println("ABC Function");
		   }
	   
	}
	class XYZ extends ABC{

	   public void myMethod(){
		System.out.println("XYZ Method");
	   }
	  
	   public void myFunction(){
			System.out.println("XYZ Function");
		   }
	   
	}
	class DEF extends XYZ{
		public void myMethod(){
			System.out.println("DEF method");
		}
		/*
		 public void myFunction(){
				System.out.println("ABC Function");
			   }*/
	}
	
public class PolyDynamic extends XYZ {

	 public static void main(String args[]){
			ABC obj = new XYZ();
			ABC obj1 = new ABC();
			XYZ obj2 = new XYZ();
			ABC obj3 = new DEF();
			XYZ obj4 = new DEF();
	//		DEF obj5 = new ABC(); // parent instance can not be assigned to child reference
			try {
				obj.myMethod();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				obj1.myMethod();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj2.myMethod();
			
			obj.myFunction();
			obj1.myFunction();
			obj2.myFunction();
			
			obj3.myFunction();
			try {
				obj3.myMethod();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		   }

}
