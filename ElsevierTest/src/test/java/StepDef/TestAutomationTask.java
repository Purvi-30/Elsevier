package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataProvider.ConfigFileReader;
import Com.Test.Purvi.*;
import io.cucumber.java.en.*;

public class TestAutomationTask {
	WebDriver driver;
	ConfigFileReader configFileReader;
	HomePage homepage;
	SignInPage signinpage;
	MyAccountPage myaccountpage;	
	Dresses dress;
	
	@Given("User is on Automation Practice website")
		public void UserIsOnAutomationPracticeWebsite() {
			configFileReader= new ConfigFileReader();
			System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(configFileReader.getApplicationUrl());
		}
		
	@When("User has added one summer dress to a cart")
	public void UserHasAddedOneSummerDressToACart() {
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		myaccountpage.clickOnDresses();
		dress = new Dresses(driver);
		dress.clickOnAddToCartBtn();	
	}
	
	@And("User has proceeded to checkout")
	public void UserHasProceededToCheckout() {
		
	}
	
	@When("User is able to Sign in at the time of checkout")
	public void UserIsAbleToSignInAtTheTimeOfCheckout() {
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		homepage = new HomePage(driver);
		homepage.clickOnSignInButton();
		signinpage = new SignInPage(driver);
		signinpage.enterUsernameAndPassword();
		
		signinpage.clickOnSignInSubmitbutton();
	
		driver.close();
		
	}

}
