package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import base.Base;
import elements.Convertlead;
import elements.Leadeles;

public class editlead extends Base
{
	public int dc=0;
	public int x2;
	public List<WebElement>ec;
	
	public void clickDelete() throws Exception 
	{
		PageFactory.initElements(driver,Convertlead.class);
		String x=Leadeles.validatedelete.getText();
		//4 items • 
		String [] p=x.split(" ");
		x.replace(" ", "");
		String y1=p[0];
		int x2=Integer.parseInt(y1);
		System.out.println(x2); //To get it in html file
		try
		{
			List<WebElement>ec=Leadeles.clicklead;
			for(WebElement e:ec)
			{
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click();",e);
				Thread.sleep(5000);
				Leadeles.clickdelete.click();
				Thread.sleep(5000);
				Leadeles.clickdeleteper.click();
				dc=dc+1;
				Reporter.log("total delete"+dc);
			}
		}
		catch(Exception ex)
		{
			ec=Leadeles.clicklead;
		}
	}
	public boolean validateDelete()
	{
		if(dc<x2)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public void editPage() throws Exception
	{
		Thread.sleep(5000);
		List<WebElement> e=Leadeles.clicklead;
		for(WebElement e1:e)
		{
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click();",e1);
		}
	}
	public void edit(String x,String y,String z ) throws Exception
	{
		Thread.sleep(5000);
		 Leadeles.clickedit.click();
		 Thread.sleep(5000);
		 WebElement e7=driver.findElement(By.xpath("//label[text()='Website']"));
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(true);",e7);
		Thread.sleep(5000);
		 Leadeles.senddetails.sendKeys(x);
		 Thread.sleep(5000);
		 Leadeles.sendemail.sendKeys(y);
		 Thread.sleep(5000);
		WebElement e8= driver.findElement(By.xpath("//label[text()='No. of Employees']"));
		 driver.executeScript("arguments[0].value='z';", e8);
		 Thread.sleep(5000);
		 Leadeles.editsave.click();
	}
	public void covert() throws Exception
	{
		Thread.sleep(6000);
		WebElement e=Convertlead.working;
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",e);
		Thread.sleep(6000);
		WebElement e1=Convertlead.Nurturing;
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",e1);
		Thread.sleep(6000);
		WebElement e2=Convertlead.converted;
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();",e2);
		Thread.sleep(6000);
		WebElement e3=Convertlead.comp;
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();",e3);
		Thread.sleep(6000);
		WebElement e4=Convertlead.convert;
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",e4);
		Thread.sleep(6000);
		WebElement e5=Convertlead.gotoelements;
		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("arguments[0].click();", e5);
	}
}
