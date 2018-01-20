package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
		// Find the element that's ID attribute is 'account'(My Account)  
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		// Find the element that's ID attribute is 'log' (Username)
		// Enter Username on the element found by above desc.
		driver.findElement(By.id("log")).sendKeys("testuser_1"); 
		// Find the element that's ID attribute is 'pwd' (Password)
		// Enter Password on the element found by the above desc.
		driver.findElement(By.id("pwd")).sendKeys("Test@123"); 
		// Now submit the form. WebDriver will find the form for us from the element  
		driver.findElement(By.id("login")).click(); 
		//very expected error message
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		System.out.println(driver.findElement(By.cssSelector("#ajax_loginform > p.response")).getText().contentEquals("ERROR: Login failed because your IP address has been blocked. Please contact the administrator."));
		// Close the driver         
		driver.quit();


	}

}
