package com.java.soliddesignprinciples;

interface IUser{
	public boolean login(String username, String password);
	public boolean register(String username, String password, String email);
}

interface ILogger{
	public void logError(String error);
}

interface IEmail{
	public boolean sendEmail(String emailContent);
}

public class SingleResponsibilityPrinciple {

}

/*1. Each class and module should focus on a single task at a time.
2. Everything in the class should be related to that single purpose.
3. There can be many members in the class as long as they related to single responsibility.
4. with SRP, classes become smaller and cleaner.
5. Code is less fragile.*/
