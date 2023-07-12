package testNGFeatures.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest2 {
	WebDriver driver;

	@Test(dataProvider = "LoginData",dataProviderClass =DataProviderTest.class, priority = 1, description = "Data Provider Test", enabled = true)
	public void launchBrowser(String Username, String Password) throws InterruptedException {
		System.out.println("Username is " + Username);
		System.out.println("Password is " + Password);
		// Thread.sleep(20000);
	}

	@Test(dataProvider = "SearchItem",dataProviderClass =DataProviderTest.class, priority = 2, description = "Data Provider Test", enabled = true)
	public void SearchItem(String Item, int quantity) throws InterruptedException {

		System.out.println("URL is >>>" + "");
		System.out.println("Item is " + Item);
		System.out.println("Quantity is " + quantity);
	}

}
