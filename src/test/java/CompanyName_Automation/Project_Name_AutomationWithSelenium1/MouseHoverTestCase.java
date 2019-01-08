package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MouseHoverTestCase {

	@Test
	public void mouseHoverConcept()
	{
		ChromeDriver chromeObj = null;
		System.out.println("Execution from Test NG");	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tushar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		  chromeObj = new ChromeDriver();
			Reporter.log("Opening the Chrome Browser");
		  chromeObj.get("https://www.flipkart.com/");
			Reporter.log("Opening the URL Browser");
			chromeObj.findElement(By.xpath("//button[contatins(text(),'X')]")).click();
			WebElement homeandfurnitureEle=chromeObj.findElement(By.xpath("//span[contatins(text(),'Home & Furniture')]"));
			Actions mymouse=new Actions(chromeObj);
			mymouse.moveToElement(homeandfurnitureEle).build().perform();
	}
}
