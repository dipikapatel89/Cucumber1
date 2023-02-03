package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage1 {

	WebDriver driver;
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"username\"]") WebElement UserName;
	@FindBy(how=How.XPATH,using="//*[@id=\"password\"]") WebElement Password;
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/div[3]/button") WebElement SignInButton;
	
	public void enterUserName(String username)
	{
		UserName.sendKeys(username);
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		  e.printStackTrace();	
		}
	}
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		  e.printStackTrace();	
		}
	}
	public void clickSignIn()
	{
		SignInButton.click();
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
		  e.printStackTrace();	
		}
	}
	public String getPageTitle()
	{
	 return driver.getTitle();	
	}
}
