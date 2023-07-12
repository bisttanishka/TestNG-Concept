package testNGFeatures.concept;

import org.testng.annotations.Test;

public class GroupsConcept {
	public class Test1 {
		  @Test(groups = { "Sanity"})
		  public void testMethod1() {
			  System.out.println("testMethod1");
		  }
		 
		  @Test(groups = {"Sanity"} )
		  public void testMethod2() {
			  System.out.println("testMethod2");
		  }
		 
		  @Test(groups = { "Regression" })
		  public void testMethod3() {
			  System.out.println("Regression");
		  }
		}

}
