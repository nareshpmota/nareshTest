package nareshtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

	
	@FindBy(xpath="//input[@id='mat-input-0']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	private WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Login']")
	private WebElement Submit;
    @FindBy (xpath="//*[@class='portal-user-menu-button__username']")
    private WebElement loginText;
    
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getResult() {
		return loginText;
	}
}
