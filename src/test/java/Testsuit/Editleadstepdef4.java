package Testsuit;

import Pages.editlead;
import Pages.lead;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editleadstepdef4 
{
	public editlead ed=new editlead ();
	public lead le=new lead();
	@Given("user is on newleadpage")
	public void click_leadoption() throws Exception
	{
		le.click_Lead();
	}
	@When("click on delete option")
	public void clickDelete() throws Exception
	{
		ed.clickDelete();
		le.click_Lead();
	}
	@Then("Lead should be deleted")
	public void deleted_Lead()
	{
		ed.validateDelete();
	}
	@Given("^user is on editpage$")
	public void user_is_on_editpage() throws Exception 
	{
		ed.editPage();
	}

	@When("^Enter (.+) and (.+) and \"(.*)\" in editpage$")
	public void enter_and_and(String title, String email, String noofemp) throws Exception  
	{
		ed.edit(title, email, noofemp);
	}

	@Then("^Lead should Edited$")
	public void lead_should_edited() throws Throwable 
	{


	}
	@Given("^user is on Leadpage$")
	public void user_is_on_leadpage() 
	{


	}

	@When("^click on next stages$")
	public void click_on_next_stages() throws Exception 
	{

		ed.covert();
	}

	@Then("^Lead is converted into lead$")
	public void lead_is_converted_into_lead()
	{

	}



}

