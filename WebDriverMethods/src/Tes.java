import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tes {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        //WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        //element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();

        // Check the title of the page
        //System.out.println("Page title is: " + driver.getTitle());
		
	}
	
}