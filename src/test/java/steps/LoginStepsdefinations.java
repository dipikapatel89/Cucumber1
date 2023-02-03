package steps;

//import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page1.DataBasePage;
import page1.LoginPage1;
import page1.TestBase1;

public class LoginStepsdefinations  extends TestBase1{

	LoginPage1 loginpage1;
	DataBasePage databasepage;
	
	@Before
	public void setUp()
	{
		initDriver();
		loginpage1=PageFactory.initElements(driver,LoginPage1.class);
		databasepage=new DataBasePage();
	}
	
	@Given ("^User is on techfios login page$")
	public void user_is_on_techfios_login_page()
	{
		
		driver.get("https://techfios.com/billing/?ng=login/");
		
	}
	@When ("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)
	{
		
		loginpage1.enterUserName(username);
		
	}
	
	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) 
	{
	  loginpage1.enterPassword(password);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() 
	{
	   loginpage1.clickSignIn();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() 
	{
		String ExpectedTitle="Dashboard- iBilling";
		String ActualTitle=loginpage1.getPageTitle();
	    Assert.assertEquals(ExpectedTitle, ActualTitle); 
	    takescreenshot(driver);
	    
	}    

	
	@Then("^User should not land on dashboard page$")
	public void user_should_not_land_on_dashboard_page() 
	{
		String ExpectedTitle="Login - iBilling";
		String ActualTitle=loginpage1.getPageTitle();
	    Assert.assertEquals(ExpectedTitle, ActualTitle); 
	    
	} 
	
	@When("^User enters \"([^\"]*)\" from techfios database$")
	public void user_enters_from_techfios_database(String logindata) 
	{
	    switch(logindata)
	    {
	    case "username":
	    	loginpage1.enterUserName(databasepage.getDataFromDb("username"));
	    	break;
	    case "password":
	    	loginpage1.enterPassword(databasepage.getDataFromDb("password"));
	    	break;
	    default:
	    	System.out.println("unable to enter login data" + logindata);
	    	break;
	    }
	    
	}
	
	
	
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}


}
