package pageObjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import nareshtest.HomePageElements;
import utilities.PageObject;

public class HomePageMethods extends PageObject{

public HomePageElements hpElements;
      public HomePageMethods() {
    	  hpElements=PageFactory.initElements(driver, HomePageElements.class);
      }
      
      public static HomePageMethods start() {
    	  return new HomePageMethods();
      }
      public HomePageMethods launch() {
    	  driver.get(prop.getProperty("applicationUrl"));
    	  return this;
      }
      public HomePageMethods enterUserName() {
    	 this.hpElements.getUsername().sendKeys(prop.getProperty("username"));
    	 return this;
      }
      public HomePageMethods enterPassword() {
    	  this.hpElements.getPassword().sendKeys(prop.getProperty("password"));
    	  return this;
      }
      public HomePageMethods submitLogin() {
    	  this.hpElements.getSubmit().click();
    	  return this;
      }

}
