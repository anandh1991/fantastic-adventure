package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NavigationTest {
	
	WebDriver driver;
   @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
              "E:\\chromedriver_win32\\chromedriver.exe");

      // initialize new WebDriver session
      driver = new ChromeDriver();
  }
   @Test
   public void f() {
	//Get Home page
	   driver.get("http://automationpractice.com/");
	//Select Element T-shirt
driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Select Element Add to cart
driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Select proceed to Checkout
driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();	   
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Verify Selected Element present in cart
boolean elestatus= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")).isDisplayed();
if (elestatus)
{
System.out.println("Element is present");}
else {
	System.out.println("Element is not present");
}
}
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Ordered and verified T-Shirt in cart successfully");
	  driver.close();
  }

}
