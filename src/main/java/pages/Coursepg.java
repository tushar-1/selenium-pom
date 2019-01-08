package pages;

import org.openqa.selenium.By;

import utility.DriverController;

public class Coursepg extends DriverController {
    By course = By.xpath("//span[contains(text(),'Course')]");
    By newcourse = By.xpath("//a[contains(text(),'New Course')]");
    By newcourseName = By.id("course_name");
    By newcourseSubmit = By.name("commit");
    
    public Coursepg clickCourse()
    {
		//driver.findElement(course).click();	
    	click(course);
		return this;
    }
    public Coursepg clickSubmit()
    {
		click(newcourseSubmit);
		return this;
    }
    public Coursepg clickNewCourse()
    {
    	click(newcourse);
    	return this;
}
    public Coursepg typeNewCourseName(String coursename)
    {
    	typeText(newcourseName,coursename);
    	return this;
	}
}