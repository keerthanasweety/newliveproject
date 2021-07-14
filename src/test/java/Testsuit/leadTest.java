package Testsuit;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\Testsuit\\lead.feature"},
		glue= {"Testsuit"},
		tags= "@Lead",
		monochrome=true,
		plugin= {"pretty","html:target\\salforce"}
		)

public class leadTest  extends AbstractTestNGCucumberTests
{

}

