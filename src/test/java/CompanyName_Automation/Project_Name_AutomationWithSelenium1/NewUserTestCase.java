package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewUserTestCase {
	
    private static final Object UserName = null;
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
		  chromeObj.findElement(By.xpath("//a[contains(text(),'New User')]")).click();
		  int randomNum = (int) (Math.random()*10000);
		  String userName = "Student"+randomNum;
		  chromeObj.findElement(By.name("user[full_name]")).sendKeys("Student8");
		  chromeObj.findElement(By.name("user[username]")).sendKeys("Student8");
		  chromeObj.findElement(By.name("user[email]")).sendKeys("Student8@abc.com");
		  chromeObj.findElement(By.id("user_batch_course_ids__chosen")).click();
		  chromeObj.findElement(By.className("active-result")).click();
		  chromeObj.findElement(By.name("commit")).click();
		  
		  WebElement usrTable =   chromeObj.findElement(By.id("selected-user-list"));
		  List<WebElement> rows = usrTable.findElements(By.tagName("tr")); //If need to break out outer loop in java
		  
		  abc:
		  for(int countRow=0;countRow<rows.size();countRow++)
		  {
			  List<WebElement> allColumns = rows.get(countRow).findElements(By.tagName("td"));
			  for(int countTd=0;countTd<allColumns.size();countTd++)
			  {
				  System.out.println(allColumns.get(countTd).getText());
				  if(allColumns.get(countTd).getText().equals(UserName))
				  {
					  break;
				  }
				  System.out.println("l");
				  System.out.println("");
			  }
		  }
		  
	}
}
