package TestNGExercise;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

public class Day1 extends TestBase{
	

	
	
	@Test
	public void Demo() throws IOException
	{
		login();
		System.out.println("Hello TestNG");
		
	}

	
	@Test(groups= {"Smoke"})
	public void Demo2()
	{
		
		System.out.println("Welcome");
	}
	
	

	@BeforeTest
	public void DemoBefore()
	{
		
		System.out.println("Nanu firstu");
	}
	
}


