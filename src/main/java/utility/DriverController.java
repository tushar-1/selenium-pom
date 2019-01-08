package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverController {

	public static WebDriver driver = null;
	private int globalWAIT=20;
	private int explicitWAITTimeOut=40;
	private String globalWait2;
	public void openBrowser(String browserName)
	{
		if(browserName.toLowerCase().startsWith("c"))
		{
			System.getProperty("webdriver.chrome.driver",
					"C:\\Users\\Tushar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				setGlobalWait2(System.getenv("TIMEOUT"));
				globalWAIT = Integer.valueOf(globalWAIT);//Converting String to Integer
			 setImplicitWaitTimeOut(globalWAIT);
		}
		else if(browserName.toLowerCase().startsWith("i"))
		{
			System.setProperty("","");
			driver= new InternetExplorerDriver();
			setImplicitWaitTimeOut(globalWAIT);
			driver.manage().window().maximize();
		}
		else if(browserName.toLowerCase().startsWith("f"))
		{
			System.setProperty("","");
			driver= new EdgeDriver();
		}
	}
	
        public void closeBrowser() {
        	driver.close();
        	driver.quit();
        	   }
        public void setImplicitWaitTimeOut(long timeOut)
        {
        	driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
        }
        public void openURL(String url) {
        	driver.get(url);
        }

		public void typeText(By locator,String txt) 
			{
			getElement(locator).sendKeys(txt);
		}
		public void click(By locator)
		{
			getElement(locator).click();
		}
		public WebElement getElement(By locator)
		{
			WebDriverWait wait = new WebDriverWait(driver,explicitWAITTimeOut);
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
		}

		public String getGlobalWait2() {
			return globalWait2;
		}

		public void setGlobalWait2(String globalWait2) {
			this.globalWait2 = globalWait2;
		}
}




















