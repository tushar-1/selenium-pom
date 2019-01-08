package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Coursepg;
import pages.Loginpg;
import utility.DriverController;

public class SuiteA {
	private DriverController controller;

	@BeforeMethod
	public void startTestCase()
	{
		DriverController controller = new DriverController();//Getting the browser from environment properties
		String bName = System.getenv("BROWSER_NAME");
		String url =System.getenv("APP_URL");
		controller.openBrowser(bName);
		controller.openURL(url);
	}
	@AfterMethod
	public void closeTest() {
		controller = null;
		controller.closeBrowser();
		
	}
     @Test(enabled=false)
    public void testLogin() {
    	Loginpg loginPage = new Loginpg();
    	loginPage.setUsernameValue("admin");
    	loginPage.setpassWordValue("myvirtualx");
    	loginPage.clickSignin();
     }
    	//Add setup of successful login -Validation and logout step --TO DO
    	
    	 @Test
    	    public void testAddnewCourse() {
    	    	Loginpg loginPage = new Loginpg();
    	    	loginPage.setUsernameValue("admin");
    	    	loginPage.setpassWordValue("myvirtualx");
    	    	loginPage.clickSignin();
    	    	
    	    	Coursepg coursePage= new Coursepg();
    	    	coursePage.clickCourse().clickNewCourse().typeNewCourseName("selenium").clickSubmit();
    	
    	 }
    
}
