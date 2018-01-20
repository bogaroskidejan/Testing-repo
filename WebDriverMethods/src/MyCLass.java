import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyCLass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dejan\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
		driver.findElement(By.linkText("Documentation")).click();
		
		if (driver.getTitle().contentEquals("Welcome: Mercury Tours")){
		System.out.println("Test passed");
		}else{
		System.out.println("Test Failed");
		}
	}

}