package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class updatePersonalInfo {
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
//Navigating Sign in page
driver.findElement(By.className("login")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Login with Existing Creds
driver.findElement(By.id("email")).sendKeys("test14@yopmail.com");
driver.findElement(By.id("passwd")).sendKeys("test@123");
driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Navigating Personal info page
driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Clearing Existing value "Anandh" in Firstname field
WebElement query = driver.findElement(By.id("firstname"));
query.clear();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Input new value "Prabhu" in Firstname field
driver.findElement(By.id("firstname")).sendKeys("Prabhu");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Input Existing password for confirmation
driver.findElement(By.id("old_passwd")).sendKeys("test@123");
//Save Account details with new values
driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span")).click();
  
  
  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Updated Personal Information Successfully");
	  driver.close();
  }

}
