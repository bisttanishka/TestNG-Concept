package testNGFeatures.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	WebDriver driver;

	@Test(dataProvider = "LoginData", priority = 1, description = "Data Provider Test", enabled = true)
	public void launchBrowser(String Username, String Password) throws InterruptedException {
		System.out.println("URL is >>>" + "");
		System.out.println("Username is " + Username);
		System.out.println("Password is " + Password);
		// Thread.sleep(20000);
	}

	@Test(dataProvider = "SearchItem", priority = 2, description = "Data Provider Test", enabled = true)
	public void SearchItem(String Item, int quantity) throws InterruptedException {
		System.out.println("URL is >>>" + "");
		System.out.println("Item is " + Item);
		System.out.println("Quantity is " + quantity);
		// Thread.sleep(20000);
	}

	@DataProvider(name = "LoginData")

//This function will return 2D object Array
	public Object[][] getData() {
		return new Object[][] { { "Rajesh", "Pathak" }, { "Rajesh1", "Pathak1" }, { "Rajesh2", "Pathak3" }

		};
	}

	@DataProvider(name = "SearchItem")

	// This function will return 2D object Array
	public Object[][] getSearchData() {
		return new Object[][] { { "Pen", 2 }, { "Tshdirt", 2 }

		};

	}

}
