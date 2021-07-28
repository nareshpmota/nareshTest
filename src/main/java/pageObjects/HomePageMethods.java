package pageObjects;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ExportExcelIO.ExcelOp;
import nareshtest.HomePageElements;
import utilities.PageObject;

public class HomePageMethods extends PageObject{
public ExcelOp loginFile;
public HomePageElements hpElements;
      public HomePageMethods() throws IOException {
    	  hpElements=PageFactory.initElements(driver, HomePageElements.class);
    	  loginFile=new ExcelOp();
      }
      
      public static HomePageMethods start() throws IOException {
    	  return new HomePageMethods();
      }
      public HomePageMethods launch() {
    	  driver.get(prop.getProperty("applicationUrl"));
    	  return this;
      }
      public HomePageMethods enterUserName() {
    	 //this.hpElements.getUsername().sendKeys(prop.getProperty("username"));
    	  this.hpElements.getUsername().sendKeys(loginFile.getCellValue(1, 0));
    	 return this;
      }
      public HomePageMethods enterPassword() throws InterruptedException {
    	  //this.hpElements.getPassword().sendKeys(prop.getProperty("password"));
    	  this.hpElements.getPassword().sendKeys(loginFile.getCellValue(1, 1));
    	  Thread.sleep(3000);
    	  return this;
      }
      public HomePageMethods submitLogin() throws InterruptedException {
    	  this.hpElements.getSubmit().click();
    	  Thread.sleep(5000);
    	  System.out.println(this.hpElements.getResult().getText());
    	  assertEquals("Fireadmin",this.hpElements.getResult().getText());
    	  return this;
      }
      public HomePageMethods PrintAllLinks() throws InterruptedException {
    	  Thread.sleep(5000);
    	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    	  for(WebElement link : allLinks) {
    		  System.out.println(link.getText());
    		  // loop prints all links
    	  }
    	  return this;
      }
}
