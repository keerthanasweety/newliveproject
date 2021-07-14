package Testsuit;

import Pages.Siginp;
import Pages.lead;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class leadstepdef2 
{
	public lead le;
	public Siginp sp;
	@Given("^user is on salesforce dashboard page$")
	public void user_is_on_salesforce_dashboard_page() throws Exception 
	{
		le=new lead();
		sp=new Siginp();
		sp.setUp();
		sp.openBrowser(); 
		sp.sigIn();
	}
	@When("^click lead object and click New$")
	public void click_lead_object_and_click_new() throws Exception
	{
		le.click_Lead();
		le.click_New();
	}
	@Then("^user is on new lead form page$")
	public void user_is_on_new_lead_form_page() throws Exception 
	{
		le.new_LeadDispalyed();

	}
}

