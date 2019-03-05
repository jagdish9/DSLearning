package com.java2.lambdaExpressions;

public class LA_HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		
		Greeting innerClassGreeting = new Greeting(){
			public void perform(){
				System.out.println("Hello World!");
			}
		};  //ananomous class implementation
		
		innerClassGreeting.perform();
		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		
	}

}

/*interface LA1 {
	void foo();
}*/

