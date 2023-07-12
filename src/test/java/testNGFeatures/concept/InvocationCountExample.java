package testNGFeatures.concept;

import org.testng.annotations.Test;

public class InvocationCountExample {
	  @Test(invocationCount = 5)
	  public void testMethod3() {
		  System.out.println("Regression");
	  }
}
