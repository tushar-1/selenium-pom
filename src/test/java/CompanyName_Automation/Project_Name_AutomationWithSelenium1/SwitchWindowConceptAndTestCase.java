package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SwitchWindowConceptAndTestCase {


	@Test
    public void switchWindowTetCase() {
		ChromeDriver chromeObj = null;

		{
			System.out.println("Execution from Test NG");	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Tushar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			  chromeObj = new ChromeDriver();
			  chromeObj.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);//Implicit Wait
				Reporter.log("Opening the Chrome Browser");
			  chromeObj.get("http://demo.myvirtualx.com/en/sign_in");
				Reporter.log("Opening the URL Browser");
				
			  chromeObj.findElement(By.id("demo")).sendKeys("admin");
			  chromeObj.findElement(By.id("password")).sendKeys("myvirtualx");
			  chromeObj.findElement(By.name("commit")).click();
			  chromeObj.findElement(By.xpath("//span[contains(text(),'Exams')]")).click();
			  chromeObj.findElement(By.xpath("//a[contains(text(),'Exam List')]")).click();/*//Explicit Wait
			  WebDriverWait wait=new WebDriverWait(chromeObj,30);
			  WebElement testLink=chromeObj.findElement(By.xpath("//a[contains(text(),'TestB')]"));
			  wait.until(ExpectedConditions.visibilityOf(testLink));
			  testLink.click();
			  WebElement testLink1=chromeObj.findElement(By.xpath("//a[contains(text(),'TestB')]"));
			  JavascriptExecutor executor = (JavascriptExecutor)chromeObj;
			executor.executeScript("arguments[0].click();",testLink1);
			  chromeObj.findElement(By.xpath("//a[contains(text(),'TestB')]")).click();*/
			  chromeObj.findElement(By.xpath("//button[@data-toggle='dropdown')]")).click();
			  chromeObj.findElement(By.xpath("//a[contains(text(),'Preview')]")).click();
			  chromeObj.findElement(By.xpath("//a[contains(text(),'The refractive index of a glass prism depends ...')]")).click();
			  /*Approach 1 ---------------------------------------------------
			  Set<String> allWindows=chromeObj.getWindowHandles();
			  Iterator<String>itr=allWindows.iterator();
			  String win1=null;
			  String win2=null;
			  while(itr.hasNext())
			  {
				  win1=itr.next();
				  win2=itr.next();
			  }
			  System.out.println("Window 1 ID is"+win1);
			  System.out.println("Title of win1"+chromeObj.getTitle());
			  System.out.println("Window 2 ID is"+win2);
			  chromeObj.switchTo().window(win2); //Switch to another window
			  System.out.println("Title of win2"+chromeObj.getTitle());
			  System.out.println("Clicking on start on window 2");
			  chromeObj.findElement(By.xpath("//a[contains(text(),'START')]")).click();
			  
			  approach 1 ends here*/
			  Object[] alwindows=chromeObj.getWindowHandles().toArray();
			  /*for(int i=0;i<alwindows.length;i++)
			  {
				  System.out.println(alwindows[i].toString());
			  }*/
				  
			  chromeObj.switchTo().window(alwindows[1].toString());
			  chromeObj.findElement(By.xpath("//a[contains(text(),'START')]")).click();
			  
			  }
}
}




















