package com.utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverManager {
private static WebDriver driver = null;
private static WebDriverManager instance = null;

private WebDriverManager() {
instance = this;
}

//Will use existing instance if exist else will create new one
public static WebDriverManager getInstance() {
if (instance != null) {
return instance;
} else {
instance = new WebDriverManager();
return instance;
}
}

//Create new instance for browser and quit existing instance of browser if available
public static WebDriver initializeDriver(String browser) {
if (driver != null) {
driver.quit();
}

switch (browser) {
case "firefox":
driver = new FirefoxDriver();
break;
case "chrome":
System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
driver = new ChromeDriver();
break;
case "ie":
System.setProperty("webdriver.ie.driver", "lib/IEDriverServer.exe");
driver = new InternetExplorerDriver();
break;
default:
System.out.println("unrecognized browser");
System.exit(0);
}
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.manage().window().maximize();
return driver;
}

//Return existing driver instance if available else create new instance & return
public static WebDriver getDriver(String browser) {
if (driver == null) {
	driver = initializeDriver(browser);
}
		return driver;
}

public static void quitDriver() {
	if (driver != null) {
		driver.quit();
		driver = null;
	}
}

@Override
protected void finalize() throws Throwable {
	quitDriver();
	super.finalize();
}

public static void resetDriver(String browser, String url) {
	driver = getDriver(browser);
	driver.manage().deleteAllCookies();
	driver.get(url);
}

public static void safeSleep(int millis) {
try {
	Thread.sleep(millis);
} catch (Exception e) {
	e.printStackTrace();
}
}
}
