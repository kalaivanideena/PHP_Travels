package com.php.stepdefinition;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.php.baseclass.BaseClass;
import com.php.helpers.FileReaderManager;
import com.php.helpers.PageObjects_PHP;
import com.php.testscripts.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PHP_LoginValidations_PageNavigations extends BaseClass{
	
	private static WebDriver driver = TestRunner.driver;
	PageObjects_PHP po = new PageObjects_PHP(driver);
	
//	@Given("^User chooses to launch chrome browser$")
//	public void user_chooses_to_launch_chrome_browser() throws Throwable {
//	    try {
//			driver = browser_LaunchIgnoreCase(FileReaderManager.getInstance().getConfigReader().getBrowserName());
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception();
//		}	    
//	}

	@Given("^URL is launched in the browser$")
	public void url_is_launched_in_the_browser() throws Throwable {
		try {
		String URL = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
		System.out.println(URL);
		launchURL(URL);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		driver.manage().window().maximize();
		Thread.sleep(4000);	    
	}

	@When("^User clicks on Login from the menu options$")
	public void user_clicks_on_Login_from_the_menu_options() throws Throwable {
	    try {

			elementClick(po.getLo().getMyAccount());
			Thread.sleep(2000);
			elementClick(po.getLo().getLoginMenuOption());
			
		} catch (Exception e) {
			e.printStackTrace();			
			throw new Exception();
		}	    
	}

	@Then("^user checks if the page login page is launched properly$")
	public void user_checks_if_the_page_login_page_is_launched_properly() throws Throwable {
	    try {
			Thread.sleep(2000);
			String text = getElementText(po.getLo().getLoginPageText());
			if(text.contains("LOGIN")) 
			{
				System.out.println("Login page is launched successfully");
				}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	@When("^Login page URL is launched in the browser$")
	public void login_page_URL_is_launched_in_the_browser() throws Throwable {
	   launchURL(FileReaderManager.getInstance().getConfigReader().getLoginURL());
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}
	
	@When("^User enters invalid email ID in the Email address field$")
	public void user_enters_invalid_email_ID_in_the_Email_address_field() throws Throwable {
	   Thread.sleep(3000);	   
	   elementSendKeys(po.getLo().getEmail(), jdbc_connections("username", 1));	    
	}

	@When("^User enters password in the Password field$")
	public void user_enters_password_in_the_Password_field() throws Throwable {
		elementSendKeys(po.getLo().getPassword(), excel_read(1, 1));	    
	}

	@When("^User clicks Login button on the Login page$")
	public void user_clicks_Login_button_on_the_Login_page() throws Throwable {
	    elementClick(po.getLo().getLoginButton());	    
	}

	@When("^user checks if the system throws error$")
	public void user_checks_if_the_system_throws_error() throws Throwable {
		Thread.sleep(2000);
		elementIsDisplayed(po.getLo().getLoginError());	    
	}

	@When("^User enters the email ID in the Email address field$")
	public void user_enters_the_email_ID_in_the_Email_address_field() throws Throwable {
		Thread.sleep(3000);
		
		elementSendKeys(po.getLo().getEmail(), excel_read(0, 1));		    
	}

	@When("^User enters invalid password in the Password field$")
	public void user_enters_invalid_password_in_the_Password_field() throws Throwable {
		elementSendKeys(po.getLo().getPassword(), jdbc_connections("password", 1));	  	    
	}

	@Then("^user checks if he is successfully logged into the PHP travels website$")
	public void user_checks_if_he_is_successfully_logged_into_the_PHP_travels_website() throws Throwable {
		Thread.sleep(2000);
		String text = getElementText(po.getLo().getUserNameOnAccountPage());
		excel_write(1, 1, text);
	    if(text.contains("JOHNY"))
	    {
	    	System.out.println("The user is logged in successfully");
	    }
	}
	
	@When("^User logs off from PHP Travels website$")
	public void user_logs_off_from_PHP_Travels_website() throws Throwable{
		elementClick(po.getLo().getUserNameOnAccountPage());
		Thread.sleep(1000);
		elementClick(po.getLo().getLogOff());
	}

	@When("^User clicks on Hotels option from the menu$")
	public void user_clicks_on_Hotels_option_from_the_menu() throws Throwable {
	    elementClick(po.getLo().getHotelsMenu());
	    
	}

	@When("^User checks if he has landed on the hotels search page$")
	public void user_checks_if_he_has_landed_on_the_hotels_search_page() throws Throwable {
		Thread.sleep(2000);
		elementIsDisplayed(po.getLo().getHotelsSearch());	    
	}

	@When("^User navigates back to home page of the user$")
	public void user_navigates_back_to_home_page_of_the_user() throws Throwable {
	    navigateBack();
	    Thread.sleep(2000);	    
	}

	@When("^User clicks on Flights option from the menu$")
	public void user_clicks_on_Flights_option_from_the_menu() throws Throwable {
		elementClick(po.getLo().getFlightsMenu());	    
	}

	@When("^User checks if he has landed on the flights search page$")
	public void user_checks_if_he_has_landed_on_the_flights_search_page() throws Throwable {
		Thread.sleep(2000);
		elementIsDisplayed(po.getLo().getFlightsSearch());	    
	}

	@When("^User clicks on Tours option from the menu$")
	public void user_clicks_on_Tours_option_from_the_menu() throws Throwable {
		elementClick(po.getLo().getToursMenu());		
	}

	@When("^User checks if he has landed on the tours search page$")
	public void user_checks_if_he_has_landed_on_the_tours_search_page() throws Throwable {
		Thread.sleep(2000);
		elementIsDisplayed(po.getLo().getToursSearch());
	}

	@When("^User clicks on Cars option from the menu$")
	public void user_clicks_on_Cars_option_from_the_menu() throws Throwable {
		elementClick(po.getLo().getCarsMenu());	    
	}

	@When("^User checks if he has landed on the cars search page$")
	public void user_checks_if_he_has_landed_on_the_cars_search_page() throws Throwable {
		Thread.sleep(2000);
		elementIsDisplayed(po.getLo().getCarsSearch());	    
	}

	@When("^User clicks on Visa option from the menu$")
	public void user_clicks_on_Visa_option_from_the_menu() throws Throwable {
		elementClick(po.getLo().getVisaMenu());	    
	}

	@When("^User checks if he has landed on the visa search page$")
	public void user_checks_if_he_has_landed_on_the_visa_search_page() throws Throwable {
		Thread.sleep(2000);
		elementIsDisplayed(po.getLo().getVisaSearch());	    
	}

	@When("^User clicks on Blog option from the menu$")
	public void user_clicks_on_Blog_option_from_the_menu() throws Throwable {
		elementClick(po.getLo().getBlogsMenu());	    
	}

	@When("^User checks if he has landed on the blogs page$")
	public void user_checks_if_he_has_landed_on_the_blogs_page() throws Throwable {
		Thread.sleep(4000);
		elementIsDisplayed(po.getLo().getBlogsPage());	    
	}

	@When("^User clicks on Offers option from the menu$")
	public void user_clicks_on_Offers_option_from_the_menu() throws Throwable {
		elementClick(po.getLo().getOffersMenu());	    
	}

	@When("^User checks if he has landed on the offers page$")
	public void user_checks_if_he_has_landed_on_the_offers_page() throws Throwable {
		Thread.sleep(3000);
		elementIsDisplayed(po.getLo().getOffersPage());	    
	}
}
