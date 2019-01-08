package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestSuite {
	
@Test
public void testCase() {
}
ChromeDriver CD = null;
@BeforeMethod
public void startTest()
{
	System.out.println("Execution from Test NG");	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Tushar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		    ChromeDriver CD = new ChromeDriver();
			Reporter.log("Opening the Chrome Browser");
			CD.get("http://vindeep.com");
			Reporter.log("Opening the URL Browser");
			
}

@Test(enabled=false)//enabled=false in test NG Ignore the testcase execution
public void calculateFdCalTest() {
	
			
			CD.findElement(By.linkText("FD Calculator")).click();//Works for Dropdown which tag starts with select
			                                                    //also works wth ListBox options as well
			Select drpdown = new Select(CD.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown")));
			drpdown.selectByVisibleText("Years");//Change the option from default monthly to yearly
			
}
@AfterMethod
public void tearOff() {
	CD.close();
}

            @Test(description="This test case is to check the default value of frequency Drop down")
            public void checkDeflutfrqDroDwnOption()
            {
            	System.out.println("Execution from Test NG");	
        		System.setProperty("webdriver.chrome.driver",
        				"C:\\Users\\Tushar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        		
        		  ChromeDriver CD = new ChromeDriver();
        				Reporter.log("Opening the Chrome Browser");
        				CD.get("http://vindeep.com");
        				Reporter.log("Opening the URL Browser");
        				
        				CD.findElement(By.linkText("FD Calculator")).click();//Works for Dropdown which tag starts with select
        				                                                    //also works wth ListBox options as well
        				WebElement frequencydropdownWebElement= CD.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown"));
        				List<WebElement> options =frequencydropdownWebElement.findElements(By.tagName("option"));
        				
        				Object opt = null;
						System.out.println("The total count of options"+((List<WebElement>) opt).size());
        				setSelected(true);
        				for(int i=0;i<options.size();i++)
        				{
        					
        					WebElement anyoption=options.get(i);
        					String selectedAttributeValu =anyoption.getAttribute("selected");
        					boolean selected = isSelected();
							if(selectedAttributeValu.equals(selected))
        					{
        						
        						String optionValue=options.get(i).getText();
        						System.out.println("The Default selected is "+optionValue );
        						Assert.assertEquals(optionValue,"Months");
        						
        					}
        				
        		
        					}
        					
        				CD.close();
            
            	                          
            }

			public boolean isSelected() {
				return isSelected();
			}

			public void setSelected(boolean isSelected) {
			}
            
}
	