package crossBrowserTesting;

import org.junit.Assert;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class crossBrowser {
	WebDriver driver;
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	ChromeOptions chromeoptions = new ChromeOptions();
	EdgeOptions edgeopotions = new EdgeOptions();
	
	//@Parameter("browser")
	@Parameters("browser")
	
	@BeforeTest
	
	public void intialize(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			System.out.println("firefox is launched");
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			driver.get("https://www.google.com");
//			WebDriverManager.chromedriver().setup();
//			driver= new ChromeDriver();
			//System.out.println("chrome is launched");
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			System.out.println("Edge is launched");
	}
	
	}
  @Test
  public void OrangeHRMUrlLaunch() {
	  driver.get("https://googl.com.au");
	  //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  String actual =driver.getTitle();
	  String expect = "OrangeHRM";
	  Assert.assertEquals(actual.contains("OrangeHRM"),expect.contains("OrangeHRM"));
	 	  
  }
  @AfterTest
  public void endTest()
  {
	  driver.quit();
  }
}
