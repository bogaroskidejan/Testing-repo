import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void testMethod() {
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		String pageSource; 
		pageSource = driver.getPageSource();
		assertTrue(pageSource.contains("Google"));
		
	}
}