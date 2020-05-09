package TestNGtutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestBase {

	
	public WebDriver driver = null;
	

	
	@AfterTest
	public void DemoBefore()
	{
		
		System.out.println("atLAST ");
	}
	
	@BeforeClass
	public void Beforeclass()
	{
		
		System.out.println("Before executing all the methods in class");
	}
	
	
	@Test
	public void WebLoginCarLoan()
	{
		
		System.out.println("webCar Login");

		
	}

	@Test
	public void login() throws IOException
	{
		Properties prop = new Properties();
				FileInputStream fis = new FileInputStream("C:\\Users\\naveen.n\\eclipse-workspace-sagar\\TestNG\\src\\TestNGtutor\\Datadriving.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		//System.out.println("I am NUM 1 ");
		System.setProperty("webdriver.ie.driver","C:\\Users\\naveen.n\\Downloads\\IEDriverServer_x64_2.48.0(1)\\IEDriverServer.exe");
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\naveen.n\\Downloads\\chromedriver.exe");
		
		if(prop.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
			
			
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else 
		{
			driver = new InternetExplorerDriver();
			
			
		}
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
	@Test(dataProvider="getdata")
	public void MobileLoginCarLoan(String username,String password)
	{
		
		System.out.println("MobileCar Login");
		System.out.println(username);
		System.out.println(password);
	}
	
	@AfterTest
	public void AfterTest()
	{
		
		System.out.println("After executing all the TESTS in class");
	}
	
	
	@AfterClass
	public void Afterclass()
	{
		
		System.out.println("After executing all the methods in class");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="Firstsetusername";
		data[0][1]="Firstpwd";
		
		data[1][0]="Secondsetusername";
		data[1][1]="Secondpwd";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpwd";
		
		return data;
		
	}
	
	@BeforeMethod
	public void BeforeeachTC()
	{
		
		System.out.println("I will execute before every test method in day3.class");
	}
	@Test(dependsOnMethods = {"MobileLoginCarLoan"})
	public void APILoginCarLoan()
	{
		
		System.out.println("APICar Login");
	}
	
	
	



}
