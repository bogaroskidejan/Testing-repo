package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
	
@FindBy(css="[title='Contact']")
private WebElement contactMenuLink;
		
@FindBy(css="[title='Freelance']")
private WebElement FreelanceMenuLink;
		
@FindBy(css="[title='Contact']")
private WebElement contactPageText;
		
@FindBy(css="[title='Freelance']")
private WebElement FreelancePageText;

WebDriver driver;
public DemoPage(WebDriver driver){
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}

public void clickContactLink(){
contactMenuLink.click();	
}
	
public void clickFreelanceLink(){
FreelanceMenuLink.click();	
}
	
public Boolean isFreelancePageTextDisplayed(){
return FreelancePageText.isDisplayed();
}
	
public Boolean isContactPageTextDisplayed(){
return contactPageText.isDisplayed();
}

	
public String getFreelancePageText(){
return FreelancePageText.getText();
}
	
public String getContactPageText(){
return contactPageText.getText();
}


}
