package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Convertlead 
{
	@FindBy(how=How.XPATH,using="(//span[text()='Working'])[1]") public static WebElement working;
	@FindBy(how=How.XPATH,using="//span[text()='Nurturing']") public static WebElement Nurturing;
	@FindBy(how=How.XPATH,using="(//span[text()='Converted'])[1]") public static WebElement converted;
	@FindBy(how=How.XPATH,using="//span[text()='Select Converted Status']//parent::button") public static WebElement comp;
	@FindBy(how=How.XPATH,using="//span[text()='Convert']") public static WebElement convert;
	@FindBy(how=How.XPATH,using="//button[text()='Go to Leads']") public static WebElement gotoelements;
}
