package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObject {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileInputStream objfile;
	@BeforeClass
	public static void startUp() throws Exception {
		
		objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
		prop.load(objfile);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		prop.clear();
		objfile.close();
	}
	
}
