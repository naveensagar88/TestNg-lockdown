package TestNGtutor;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class Day4 {


	@AfterTest
	public void DemoBefore()
	{
		
		System.out.println("LAST naane");
	}
	
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan()
	{
		
		System.out.println("webHome Login");
	}

	
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan()
	{
		
		System.out.println("MobileHome Login");
	}
	
	@Parameters("URL")
	@Test
	public void MobileSignin(String uname)
	{
		
		System.out.println("Mobile Signin");
		System.out.println(uname);
	}
	
	@Test(enabled=true)
	public void MobileSignoff()
	{
		
		System.out.println("Mobile Signoff");
	}
	
	@Test(groups= {"Smoke"})
	public void APILoginHomeLoan()
	{
		
		System.out.println("APIHome Login");
	}
}
