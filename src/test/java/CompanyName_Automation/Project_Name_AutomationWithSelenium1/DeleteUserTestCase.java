package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DeleteUserTestCase {
	ChromeDriver chromeObj = null;
	@Test
    public void addTestUser()
	{
		System.out.println("Execution from Test NG");	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tushar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		  chromeObj = new ChromeDriver();
			Reporter.log("Opening the Chrome Browser");
		  chromeObj.get("http://demo.myvirtualx.com/en/sign_in");
			Reporter.log("Opening the URL Browser");
			
		  chromeObj.findElement(By.id("demo")).sendKeys("admin");
		  chromeObj.findElement(By.id("password")).sendKeys("myvirtualx");
		  chromeObj.findElement(By.name("commit")).click();
		  chromeObj.findElement(By.xpath("//span[contains(text(),'Users')]")).click();
		  chromeObj.findElement(By.xpath("//span[contains(text(),'User List')]")).click();
		  chromeObj.findElement(By.xpath("//*[@id='selected-user-list']//tr[1]/td/div/div/button")).click();
		  
		  WebElement rowOperation = chromeObj.findElement(By.xpath("//*[@id='selected-user-list']//tr[1]/td/div/div/ul"));
		  List<WebElement>options =rowOperation.findElements(By.tagName("li"));
		  WebElement deleteOption=options.get(2);
		  deleteOption.click();
		  //chromeObj.switchTo().alert().accept(); //Click on OK Yes or Confirmation
		  //chromeObj.switchTo().alert().dismiss(); //Click on Cancel or No or deny or simulate the escape button
		  String alertMsg =chromeObj.switchTo().alert().getText(); //get the text from Alert
		  System.out.println(alertMsg);
		  chromeObj.switchTo().alert().accept();
	}
	
}
