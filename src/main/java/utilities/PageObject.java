package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PageObject {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileInputStream objfile;
	public static String nodeUrl = "http://192.168.0.106:5566/wd/hub";
	public static DesiredCapabilities capibilities;
	@BeforeClass
	public static void startUp() throws Exception {
		/*
		 * This peace of  commented code is for executing the test cases on nodess
		 * Author : Naresh Mota
		 * 
		 */
		/*capibilities = DesiredCapabilities.firefox();
		capibilities.setBrowserName("firefox");
		capibilities.setVersion("89.0.1");
		capibilities.setPlatform(Platform.LINUX);
		capibilities.setCapability("marionette", true);
		driver = new RemoteWebDriver(new URL(nodeUrl),capibilities);*/
		objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
		prop.load(objfile);
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		//capibilities.wait(10000);
		Thread.sleep(10000);
		//driver.close();
		driver.quit();
		prop.clear();
		objfile.close();
	}
	
}
