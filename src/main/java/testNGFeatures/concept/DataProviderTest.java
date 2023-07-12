package testNGFeatures.concept;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
	@DataProvider(name = "LoginData")

	//This function will return 2D object Array
	public static Object[][] getData() {
		return new Object[][] {
	        {"Rajesh", "Pathak"},
	        {"Rajesh1", "Pathak1"},
	        {"Rajesh2", "Pathak3"}
	        
	    };
	}
	     
	    @DataProvider(name ="SearchItem")

	  //This function will return 2D object Array
	  public static Object[][] getSearchData() {
	  	return new Object[][] {
	          {"Pen", 2},
	          {"Tshdirt", 2}
	          
	      };
		
	}
}
