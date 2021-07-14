package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Leadeles;

public class lead extends Base
{
	public void click_Lead() throws Exception
	{
		PageFactory.initElements(driver,Leadeles.class);
		Thread.sleep(5000);
		/*Screen s=new Screen();
		s.click("\\src\\test\\resources\\Capture1.PNG");*/
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Leadeles.lead);
		Thread.sleep(5000);
	}
	public void click_New() throws Exception
	{
		Leadeles.New.click();
	}
	public boolean new_LeadDispalyed()
	{
		try
		{
			Leadeles.newleadpage.isDisplayed();
			exttest=report.createTest("new_leadDisplaypage");
			exttest.log(Status.PASS, "new lead Displayed");
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("new_LeadDispaly");
			exttest.log(Status.FAIL,"Entered new Lead");
			return false;
			
		}
	}
	
}
