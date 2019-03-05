package com.java.soliddesignprinciples;

interface IPrintTasks {
	public boolean printContent(String content);
	public boolean scanContent(String content);
	public boolean faxContent(String content);
	public boolean photoCopyContent(String content);
}

public class InterfaceSegragationPrinciple implements IPrintTasks {

	@Override
	public boolean printContent(String content) {
		// TODO Auto-generated method stub
		System.out.println("Print Done");
		return true;
	}

	@Override
	public boolean scanContent(String content) {
		// TODO Auto-generated method stub
		System.out.println("Scan Done");
		return true;
	}

	@Override
	public boolean faxContent(String content) {
		// TODO Auto-generated method stub
		System.out.println("Fax Done");
		return true;
	}

	@Override
	public boolean photoCopyContent(String content) {
		// TODO Auto-generated method stub
		System.out.println("PhotoCopy Done");
		return true;
	}
	
}

/*Here everything is fine the issue is where i have canonMG2470 printer which performs 
normal print content task but does not support fax content, in that case we have to implement all
the interface methods that is the issue 
1. In future, suppose there is requirement to add new method in IPrintTasks interface in that case existing client must have 
implement that method as well.
2. If any client support only print and photocopy the content in that case client needs to implement the methods which
client does not support. these are two issue.
To overcome this issue we use interface segragation principle.*/
