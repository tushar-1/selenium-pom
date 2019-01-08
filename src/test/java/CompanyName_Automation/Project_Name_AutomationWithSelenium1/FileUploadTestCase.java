package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FileUploadTestCase {
	ChromeDriver chromeObj = null;
	@Test
    public void addTestUser() throws InterruptedException
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
		  chromeObj.findElement(By.xpath("//a[contains(text(),'Import Users')]")).click();
		  chromeObj.findElement(By.xpath("//*[@id=\"new_user_import\"]/div[1]/div/div/div/span/label/span[2]]")).click();
		 //Runtime.getRuntime().exec("path upload exe");
		   /*try {
			   Thread.sleep(2000);
			Runtime.getRuntime().exec("../Project_Name_AutomationWithSelenium1/uploadexe/uploadScript.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  
		  String fileToUpload="abc.txt";
		  String autoITExecutable ="../Project_Name_AutomationWithSelenium1/uploadexe/uploadScriptWithParameter.exe"+fileToUpload;
		  try {
			   Thread.sleep(2000);
			Runtime.getRuntime().exec(autoITExecutable+fileToUpload);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
}
}