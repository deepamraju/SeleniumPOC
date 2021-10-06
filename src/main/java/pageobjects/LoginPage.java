package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	
	
	
	By username=By.cssSelector("input[id*='user-name']");
	By password=By.cssSelector("input[id*='password']");
	By login=By.cssSelector("input[id*='login']");
	
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUsername()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
		
	}

}
