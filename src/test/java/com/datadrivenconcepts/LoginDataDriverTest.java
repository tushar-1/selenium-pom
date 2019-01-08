package com.datadrivenconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CompanyName_Automation.Project_Name_AutomationWithSelenium1.ReadTestData;

public class LoginDataDriverTest {
  @Test
  public void testDataDriverLoginTest(String username,String password)
  {
	  System.setProperty("webdriver.chrome.driver", "../Project_Name_AutomationWithSelenium1/target/chromedriver.exe");
			  
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demo.myvirtualx.com/en/sign_in");
	driver.findElement(By.id("demo")).sendKeys(username);
	driver.findElement(By.id("user_password")).sendKeys(password);
	  driver.findElement(By.name("commit")).click();
  }
  @DataProvider(name="dp")
  public Object[][] loginTestData()
  {
	  /*Object[][] testdata= {{"admin","myvirtualx"},
			               {"student","myvirtualx"}};*/
	  Object[][] testdata = ReadTestData.testDataFromExcel();
	return testdata;
	  
	  
	  }
  }

