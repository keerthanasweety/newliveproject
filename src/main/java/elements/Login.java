package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login 
{
	@FindBy(how=How.XPATH,using="//input[@name='username']") public static WebElement userid;
	@FindBy(how=How.XPATH,using="//input[@id='password']") public static WebElement pwd;
	@FindBy(how=How.XPATH,using="//input[@id='Login']") public static WebElement login;
	@FindBy(how=How.XPATH,using="//span[text()='Home']/parent::a") public static WebElement homepage; 
}
