package com.selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {
WebDriver driver;
@BeforeTest
public void launchBrowser() {

WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.manage().window().maximize();
}
@Test
public void verifyAlertTest() throws InterruptedException {

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("12345");
driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//Thread.sleep(10000);
// Now we will handle confirmation Alert !
//Switching to Alert   
Alert alert =driver.switchTo().alert();
//Capturing alert message
String alertMessage= alert.getText();
Assert.assertEquals(alertMessage, "Do you really want to delete this Customer?");
System.out.println("Alert Message"+alertMessage);
 
//Dismissing(cancel)the alert
alert.dismiss();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//Accept alert
alert.accept();
Thread.sleep(2000);
String confirmationMsg= alert.getText();
Assert.assertEquals(confirmationMsg, "Customer Successfully Delete!");
System.out.println("Alert Message"+confirmationMsg);
alert.accept();
boolean guruDisplay=driver.findElement(By.xpath("//h2[text()=\"Guru99 Bank\"]")).isDisplayed();
Assert.assertEquals(guruDisplay, true);

//Below are the methods of the Alert
//1.Alert alert =driver.switchTo().alert();
//Get TeXT -> alert.getText();
//Accept Alert ->alert.accept();
//cancel Alter-> alert.dismiss();
// To enter the input in the alertbox use -> alert.sendKeys();



}
}
