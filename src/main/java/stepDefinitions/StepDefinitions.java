package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
	WebDriver driver=null;
	@Given ("The user has opened Chrome browser")
	public void openBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
    @When("user enters url")
    public void openApplication(String application)
    {
    	driver.get(getUrl());
    }
    
    @And("User login to application using valid credentials")
    public void loginApplication()
    {
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(getUsername());
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getPassword());
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("User validate the home page")
    public void validateHomepage()
    {
    	
    	driver.findElement(By.xpath("//span[contains(text(),'My Info')]")).isDisplayed();
    	driver.close();
    	
    }
   

}
