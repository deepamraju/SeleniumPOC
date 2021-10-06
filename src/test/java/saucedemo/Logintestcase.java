package saucedemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import resources.base;

public class Logintestcase extends base {
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();
		
	}
	
	
	
	
	
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2]; //    In array if array size is 2= means index is arr[0] and arr[1]
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		data[1][0]="problem_user";
		data[1][1]="secret_sauce";
		
		return data;
		
		
	}
	
	
	

}
