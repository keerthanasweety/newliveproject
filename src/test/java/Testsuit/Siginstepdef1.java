package Testsuit;

import Pages.Siginp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Siginstepdef1 
{
	public Siginp sp;
	@Given("^user is on LoginPage$")
	public void user_is_on_loginpage() throws Exception  
	{
		sp=new Siginp();
		sp.setUp();
		sp.openBrowser();
	}
	@When("^Enter userid password and login$")
	public void enter_userid_password_and_login() throws Exception 
	{
		sp.sigIn();

	}
	@Then("^user should be loged in$")
	public void user_should_be_loged_in() throws Throwable 
	{
		sp.validate_homePage();
		sp.teadDown();
	}

}

