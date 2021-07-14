package Pages;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Login;

public class Siginp extends Base
{
    
	public void openBrowser() throws Exception
	{
		PageFactory.initElements(driver,Login.class);
		//PageFactory.initElements(driver, page);
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	 
	public void sigIn() throws Exception
	{
		Login.userid.sendKeys(p.getProperty("username"));
		Login.pwd.sendKeys(p.getProperty("password"));
		Login.login.click();
		exttest=report.createTest("Homepage");
		exttest.log(Status.PASS,"Login passed");
		takeScreenshot("Loginfunction.png");
	}
	
	public boolean validate_homePage() throws Exception
	{
		try
		{
			Login.homepage.isDisplayed();
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("Loged in");
			exttest.log(Status.FAIL,"HomePage visible");
			return false;
		}
	}
	
	

}
