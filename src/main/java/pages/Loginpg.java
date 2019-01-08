package pages;
import org.openqa.selenium.By;

import utility.DriverController;

	public class Loginpg extends DriverController {
	        public final By userNameLocator=By.id("demo");
	        public final By passWordLocator=By.name("user[password]");
	        public final By signInLocator=By.name("commit");
	        public final By rememberMeLocator=By.id("user_remember_me");
	        public final By forgotPasswordLocator=By.linkText("user_remember_me");

	        public void setUsernameValue(String value)
	        {
	        	driver.findElement(userNameLocator).sendKeys(value);
	        }
	        public void setpassWordValue(String value)
	        {
	        	driver.findElement(passWordLocator).sendKeys(value);
	        }
	        public void clickSignin()
	        {
				driver.findElement(signInLocator).click();
	        }
}