package navigationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationPage {
WebDriver driver;
@BeforeTest
public void launchBrowser() throws InterruptedException {

WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/");
//driver.get("https://www.amazon.com");we can open site by navigate.to() also !
driver.navigate().to("https://www.amazon.com");
driver.manage().window().maximize();
Thread.sleep(3000);
}
@Test
public void verifyNavigation() throws InterruptedException {

	driver.navigate().back();//Take back to snapdeal
	driver.navigate().forward();// again to amazon
	Thread.sleep(3000);
	driver.navigate().refresh();//refresh the page
	Thread.sleep(3000);
	
}
@AfterTest
public void closeBrowser() {
	driver.close();
}
}
