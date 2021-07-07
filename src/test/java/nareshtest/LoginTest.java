package nareshtest;

import java.io.IOException;

import org.junit.Test;

import utilities.PageObject;
import pageObjects.HomePageMethods;

public class LoginTest extends PageObject{
    @Test
	public void loginTest() throws IOException, InterruptedException {
	 HomePageMethods.start()
	                .launch()
	                .enterUserName()
	                .enterPassword()
	                .submitLogin();
	
}
}