package com.php.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PHP_Login {
	
	static WebDriver driver;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul[2]/ul[1]/li[1]/a")
	private WebElement myAccount;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse']/ul[2]/ul/li[1]/ul/li[1]/a")
	private WebElement loginMenuOption;
	
	@FindBy(xpath="//div[@class='panel-heading go-text-right']")
	private WebElement loginPageText;
	
	@FindBy(name="username")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement loginError;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul[2]/ul/li[1]/a")
	private WebElement userNameOnAccountPage;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")
	private WebElement logOff;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul/li[2]/a/span")
	private WebElement hotelsMenu;
	
	@FindBy(xpath="//div[@id='s2id_autogen8']/a/span[1]")
	private WebElement hotelsSearch;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul/li[3]/a/span")
	private WebElement flightsMenu;
	
	@FindBy(xpath="//div[@id='s2id_location_to']/a/span[1]")
	private WebElement flightsSearch;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul/li[4]/a/span")
	private WebElement toursMenu;
	
	@FindBy(xpath="//div[@id='s2id_autogen10']/a/span[1]")
	private WebElement toursSearch;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul/li[5]/a/span")
	private WebElement carsMenu;
	
	@FindBy(xpath="//div[@id='s2id_carlocations']/a/span[1]")
	private WebElement carsSearch;
	
	@FindBy(xpath="//nav[@class='navbar navbar-default']/div/div[2]/ul/li[6]/a/span")
	private WebElement visaMenu;
	
	@FindBy(xpath="//div[@id='s2id_autogen4']/a/span[1]")
	private WebElement visaSearch;
	
	@FindBy(xpath="//li[@class='text-center go-right'][2]/a")
	private WebElement blogsMenu;
	
	@FindBy(xpath="//div[@class='panel-heading title_rtl']")
	private WebElement blogsPage;
	//Latest Posts
	
	@FindBy(xpath="//li[@class='text-center go-right'][3]/a")
	private WebElement offersMenu;
	
	@FindBy(xpath="//div[@class='listingbg']/div/div[3]/div[2]/h4")
	private WebElement offersPage;
	//Lunch Discount

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getLoginMenuOption() {
		return loginMenuOption;
	}
	
	public WebElement getLoginPageText() {
		return loginPageText;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getLoginError() {
		return loginError;
	}

	public WebElement getUserNameOnAccountPage() {
		return userNameOnAccountPage;
	}
	
	public WebElement getLogOff() {
		return logOff;
	}

	public WebElement getHotelsMenu() {
		return hotelsMenu;
	}

	public WebElement getHotelsSearch() {
		return hotelsSearch;
	}

	public WebElement getFlightsMenu() {
		return flightsMenu;
	}

	public WebElement getFlightsSearch() {
		return flightsSearch;
	}

	public WebElement getToursMenu() {
		return toursMenu;
	}

	public WebElement getToursSearch() {
		return toursSearch;
	}

	public WebElement getCarsMenu() {
		return carsMenu;
	}

	public WebElement getCarsSearch() {
		return carsSearch;
	}

	public WebElement getVisaMenu() {
		return visaMenu;
	}

	public WebElement getVisaSearch() {
		return visaSearch;
	}

	public WebElement getBlogsMenu() {
		return blogsMenu;
	}

	public WebElement getBlogsPage() {
		return blogsPage;
	}

	public WebElement getOffersMenu() {
		return offersMenu;
	}

	public WebElement getOffersPage() {
		return offersPage;
	}
	
	public PHP_Login(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}
