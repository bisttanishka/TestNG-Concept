package testNGFeatures.concept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependExample {

	@Test()
	public void serverStartedOk() {
		System.out.println("serverStartedOk");
		 // Explicitly fail the test
        Assert.fail("Test failed intentionally");
	}
	 
	@Test(dependsOnMethods = { "serverStartedOk" })
	public void method1() {
		
		System.out.println(" method1()");
	}
	
	@Test(dependsOnMethods = { "serverStartedOk" })
	public void method2() {
		System.out.println(" method2()");
		
	}
	
	@Test(dependsOnMethods = { "serverStartedOk" })
	public void method3() {
		System.out.println(" method3()");
		
	}
	
	@Test(enabled = true)
	public void method4() {
		System.out.println(" method4()");
		
	}

}
