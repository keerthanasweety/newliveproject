package Testsuit;

import Pages.Siginp;
import Pages.lead;
import Pages.newlead;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Newleadstepdef3 
{
	public lead le=new lead();
	public Siginp sp=new Siginp();
	public newlead nl=new newlead();
	@Given("^user is on NewLead$")
	public void user_is_on_newlead() throws Exception
	{
		le.new_LeadDispalyed();
	}
	@When("^Enter (.+) and (.+) and (.+) and (.+)$")
	public void enter_and_and_(String salutation, String lastname, String company,String Industry) throws Exception 
	{
		nl.newLead_Dropdown(salutation);
		nl.LastName(lastname);
		nl.companyName(company);
		nl.industry_DropDown(Industry);
		nl.clickSave();
		le.click_Lead();
		le.click_New();
	}

	@Then("^new lead should be created$")
	public void new_lead_should_be_created() throws Exception 
	{
		nl.createLeadPage();
	}
}

