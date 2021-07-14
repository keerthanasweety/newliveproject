package Testsuit;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\Testsuit\\Sigin.feature"},
		glue= {"Testsuit"},
		tags= "@tag1",
		monochrome=true,
		plugin= {"pretty","html:target\\salforce"}
		)

public class LoginTest extends AbstractTestNGCucumberTests
{

}


