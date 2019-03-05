package cpm.java2.harman;

public class Test1 {

	public static void main(String[] arg){
		demo1();
		demo2();
		demo3();
	}
	
	private static void demo1(){
		int x = 1, y = 3, z = 2;
		if(x < y){
			x = ++y + z++;
			System.out.println(x);
		}
	}
	
	private static void demo2(){
		int x = 1, y = 3, z = 2;
		if(x < y){
			x = ++x + y++ + z++;
			System.out.println(x);
		}
	}
	
	private static void demo3(){
		int x = 1, y = 3, z = 2;
		if(x < y){
			x = ++y + y-- + x++ + z++;
			System.out.println(x);
		}
	}
}
