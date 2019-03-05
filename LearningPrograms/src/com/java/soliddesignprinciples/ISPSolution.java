package com.java.soliddesignprinciples;

interface IPrintScanContent{
	public boolean printContent(String content);
	public boolean scanContent(String content);
	public boolean photoCopyContenet(String content);
}

interface IFaxContent{
	public boolean scanContent(String content);
}

interface IPrintDuplex{
	public boolean duplexContent(String content);
}

public class ISPSolution {

}

//Here we have segragated(seprated) the interface methods 