package com.java2.lambdaExpressions;

public class GreeterWithInterface {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GreeterWithInterface greeter = new GreeterWithInterface();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		HelloIndiaGreeting helloIndiaGreeting = new HelloIndiaGreeting();
		greeter.greet(helloIndiaGreeting);
	}

}
