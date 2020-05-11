package testcasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositories.RediffHomepage;
import objectRepositories.Rediffloginpage;

public class Loginapp {
	
	@Test
	public void login()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\naveen.n\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Rediffloginpage Rf = new Rediffloginpage(driver);
		Rf.Email().sendKeys("Hello");
		Rf.Password().sendKeys("pwd");
		//Rf.Go().click();
		Rf.Home().click();
		RediffHomepage Rh = new RediffHomepage(driver);
		Rh.Search().sendKeys("rocky");
		Rh.Submit().click();
		System.out.println("Super "
				+ "star");
		
		
	}
	

}
