package nareshtest;

import org.junit.Test;

import utilities.PageObject;
import pageObjects.HomePageMethods;

public class LoginTest extends PageObject{
    @Test
	public void loginTest() {
	 HomePageMethods.start()
	                .launch()
	                .enterUserName()
	                .enterPassword()
	                .submitLogin();
	
}
}