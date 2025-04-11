package Login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Reporter;

import GenericUtilities.Property_Utility;
import GenericUtilities.WebDriver_Utility;
import POM_Pages.HomePomPage;
import POM_Pages.loginDetailPomPage;
import POM_Pages.loginPomPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver_Utility w_util = new WebDriver_Utility();

		Property_Utility pro = new Property_Utility();
		String Browser = (pro.FetchDataFromPropertyFile("Browser"));
		String url = (pro.FetchDataFromPropertyFile("url"));
		String workemail = (pro.FetchDataFromPropertyFile("workemail"));
		String password = (pro.FetchDataFromPropertyFile("password"));
		String timeouts = (pro.FetchDataFromPropertyFile("timeouts"));

		// Launch the browser
		WebDriver driver = null;
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		// Maximize the window
		w_util.maximizeTheWindow(driver);

		// Implicit wait
		w_util.waitTillElementFound(timeouts, driver);

		// Navigate to an application
		w_util.navigateToAnAppl(driver, url);

		// Click on login button
		HomePomPage home = new HomePomPage(driver);
		home.getlogin();

		// Switch the driver control to child window
		w_util.switchToTabUsingUrl(driver, "https://www.intervue.io/access-account");

		// click on login button
		loginPomPage l = new loginPomPage(driver);
		l.getlogin_button();

		// Identify email & pwd textfield and enter values
		loginDetailPomPage ldetail = new loginDetailPomPage(driver);
		ldetail.getemial_TF(workemail);
		ldetail.getpassword_TF(password);

		// Click on login with email button
		WebElement button = ldetail.getloginwithEmail_button();
		w_util.Action_MouseHovering(driver, button);

		// Verify login with email button
		if (button.getText().equals("Login with email")) {
			Reporter.log("Test Pass: Button text matches exactly", true);
		} else {
			Reporter.log("Test Fail: Expected 'Login with email' but found '" + button.getText() + "'", true);
		}

		// close the browser
		w_util.QuitTheBrowser(driver);
	}

}
