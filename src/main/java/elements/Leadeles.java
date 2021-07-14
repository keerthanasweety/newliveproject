package elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Leadeles
{
	@FindBy(how=How.XPATH,using="//span[text()='Leads']/parent::a") public static WebElement lead; 
	@FindBy(how=How.XPATH,using="//div[@title='New']/parent::a") public static WebElement New;
	@FindBy(how=How.XPATH,using="//h2[text()='New Lead']") public static WebElement newleadpage;
	@FindBy(how=How.XPATH,using="//input[@name='salutation']") public static WebElement salitation;
	@FindBy(how=How.XPATH,using="//input[@name='lastName']") public static WebElement lastname; 
	@FindBy(how=How.XPATH,using="//input[@name='Company']") public static WebElement company;
	@FindBy(how=How.XPATH,using="//span[text()='Lead Owner']") public static WebElement leadowner;
	@FindBy(how=How.XPATH,using="//label[text()='Website']") public static WebElement website;
	@FindBy(how=How.XPATH,using="//button[text()='Save']") public static WebElement clicksave;
	@FindBy(how=How.XPATH,using="//span[text()='New']//parent::a]") public static WebElement enteredleadpage; 
	@FindBy(how=How.XPATH,using="(//tbody//tr//th//descendant::a)[position()=2]") public static List<WebElement> clicklead;
	@FindBy(how=How.XPATH,using="(//button[text()='Delete'])[2]") public static WebElement clickdelete;
	@FindBy(how=How.XPATH,using="//span[text()='Delete']") public static WebElement clickdeleteper;
	@FindBy(how=How.XPATH,using="(//div[@aria-live='polite']/span)[1]") public static WebElement validatedelete;
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Edit')]") public static WebElement onditpage;
	@FindBy(how=How.XPATH,using="(//button[text()='Edit'])[2]") public static WebElement clickedit;
	@FindBy(how=How.XPATH,using="//input[@name='Title']") public static WebElement senddetails;
	@FindBy(how=How.XPATH,using="//input[@name='Email']") public static WebElement sendemail;
	@FindBy(how=How.XPATH,using="//label[text()='No. of Employees']") public static WebElement noofemp;
	@FindBy(how=How.XPATH,using="//button[text()='Save']") public static WebElement editsave;
	
}
