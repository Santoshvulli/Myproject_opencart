package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement Myaccount_btn;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Register_btn;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement Login_btn;

	public void ClickMyaccount() {
		Myaccount_btn.click();
	}

	public void Clickregister() {
		Register_btn.click();
	}

	public void ClickLoginbutton() {
		Login_btn.click();
	}

}