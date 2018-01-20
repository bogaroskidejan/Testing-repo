package com.stepDefinition;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pageObject.DemoPage;
import com.utility.WebDriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {

	//You can change value of chrome to firefox and ie
	static WebDriver driver = WebDriverManager.getDriver("chrome");
	@Given("^Clear all test data before executing any scenario$")
	public void clear_all_test_data_before_executing_any_scenario() throws Throwable {
	System.out.println("Clearing test data.........");
	}

	@Given("^User is on WannaFlex Home page$")
	public void use_is_on_WannFlex_Home_page() throws Throwable {
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.get("https://www.wannaflex.nl/");
	}

	@When("^User clicks on Contact nav menu$")
	public void user_Clicks_on_Conatact_nav_enu() throws Throwable {
	DemoPage demoPage = new DemoPage(driver);
	demoPage.clickContactLink();
	}

	@Then("^User should go to Contact page$")
	public void user_should_navigate_contact_page() throws Throwable {
	DemoPage demoPage = new DemoPage(driver); 
	Assert.assertTrue(demoPage.isContactPageTextDisplayed());
	}

	@When("^User clicks on \"([^\"]*)\" nav menu$")
	public void user_Clicks_on_nav_enu(String arg1) throws Throwable {
	DemoPage demoPage = new DemoPage(driver);
	if (arg1.equalsIgnoreCase("Contact")) {
	demoPage.clickContactLink();
	}
	if (arg1.equalsIgnoreCase("Freelance")) {
	demoPage.clickFreelanceLink();
	}
	}


	@Then("^User should go to \"([^\"]*)\" page$")
	public void user_should_navigate_page(String arg1) throws Throwable {
	DemoPage demoPage = new DemoPage(driver); 
	if (arg1.equalsIgnoreCase("Contact")) {
	Assert.assertTrue(demoPage.isContactPageTextDisplayed());
	}
	if (arg1.equalsIgnoreCase("Freelance")) {
	Assert.assertTrue(demoPage.isFreelancePageTextDisplayed());
	}
	}

	@Then("^User should navigate \"([^\"]*)\" page and see proper text as \"([^\"]*)\"$")
	public void user_should_navigate_page_and_see_proper_text_as(String arg1, String arg2) throws Throwable {
	DemoPage demoPage = new DemoPage(driver);
	if (arg1.equalsIgnoreCase("Contact")) {
	Assert.assertEquals(demoPage.getContactPageText(), arg2);
	}
	if (arg1.equalsIgnoreCase("Freelance")) {
	Assert.assertEquals(demoPage.getFreelancePageText(), arg2);
	}
	}
	
}