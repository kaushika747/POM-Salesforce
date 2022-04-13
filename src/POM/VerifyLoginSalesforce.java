//SALESFORCE

package POM;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLoginSalesforce {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome",
				"https://login.salesforce.com/?locale.in");
		LoginPage loginSalesforce = PageFactory.initElements(driver, LoginPage.class);
		loginSalesforce.LoginSalesforce("Admin","admin123");
		}

}
