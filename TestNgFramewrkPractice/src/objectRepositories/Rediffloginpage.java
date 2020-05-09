package objectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

	WebDriver driver;

	public Rediffloginpage(WebDriver driver) {
		this.driver = driver;

	}

	By username = By.xpath("//input[@id='login1']");
	By password = By.name("passwd");
	By Go = By.name("proceed");
	By home = By.linkText("Home");

	public WebElement Email()

	{
		return driver.findElement(username);
	}

	public WebElement Password()

	{
		return driver.findElement(password);
	}

	public WebElement Go()

	{
		return driver.findElement(Go);
	}

	public WebElement Home()

	{
		return driver.findElement(home);
	}
	
}
