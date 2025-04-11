package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePomPage {
	
    //Declare
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;

	// Initialize
	public HomePomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilize
	public void getlogin() {
		 login.click();
	}


}
