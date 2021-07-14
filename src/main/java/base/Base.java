package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base
{
    public static RemoteWebDriver driver;
    public static Properties p;
     public static ExtentHtmlReporter exthtml;
    public static ExtentTest exttest;
    public static ExtentReports report;
    public static WebDriverWait wait;
	
   @BeforeSuite
    public void setUp() throws Exception
    {
	   String pfpath=System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties";
	   FileInputStream fi=new FileInputStream(pfpath);
    	p=new Properties();
    	p.load(fi);
    	if(p.getProperty("browsername").matches("firefox"))
    	{
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    	}
    	else if(p.getProperty("browsername").matches("chrome"))
    	{
    		ChromeOptions co=new ChromeOptions();
    		String[] s=new String[] {"enable-automation"};
    		co.setExperimentalOption("excludeSwitches",s);
    		co.addArguments("--disable-notifications");
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver(co);
    	}
    	else if(p.getProperty("browsername").matches("edge"))
    	{
    		WebDriverManager.edgedriver().setup();
    		driver=new EdgeDriver();
    	}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    
    	wait=new WebDriverWait(driver, 50);
    	   exthtml = new ExtentHtmlReporter(p.getProperty("reportlocation"));
		   report = new ExtentReports();
	 	   report.attachReporter(exthtml);
	 	   report.setSystemInfo("Host Name", "TestSystem");  //name of the system
	 	   report.setSystemInfo("Environment", "Test Env");
	 	   report.setSystemInfo("User Name", "keerthana");
	 	   
	 	   exthtml.config().setDocumentTitle("Salefore");
	 	   exthtml.config().setReportName("Saleforce Functional Testing");
	 	   exthtml.config().setTestViewChartLocation(ChartLocation.TOP);
	 	   exthtml.config().setTheme(Theme.STANDARD);
    }
    
    public void takeScreenshot(String imagename) throws Exception
    {
    	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{FileUtils.copyFile(f,new File(p.getProperty("screenshots")+imagename));
		    exttest.addScreenCaptureFromPath(p.getProperty("screenshots")+imagename);}catch(Exception e) {}
    }
    
    @AfterSuite
    public void teadDown()
    {
    	driver.close();
    	report.flush();
		
    }
    
}

