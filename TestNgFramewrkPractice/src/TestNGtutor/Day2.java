package TestNGtutor;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Day2 extends TestBase {

	
	@Test
	public void paersonal() throws IOException
	{
		
		System.out.println("Hello sagar");
		
	}
	
	
	@AfterSuite
	public void Beforeevery() throws IOException
	{
		login();
		System.out.println("I am LAST 1 ");
	}
	
}


