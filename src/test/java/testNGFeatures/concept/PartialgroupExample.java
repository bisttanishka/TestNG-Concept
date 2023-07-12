package testNGFeatures.concept;

import org.testng.annotations.Test;

@Test(groups = { "Preet" }) //class level groups are applicable for all the methods inside that class
public class PartialgroupExample {

	@Test(groups = { "Jeet" })  //Method level group is only applicable for that particular method 
	public void test1() {
		System.out.println("test1");
	}
	
	
	public void test2() {
		System.out.println("test2");
	}
}
