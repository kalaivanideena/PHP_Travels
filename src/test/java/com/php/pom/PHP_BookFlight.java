package com.php.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mongodb.selector.PrimaryServerSelector;

public class PHP_BookFlight {

	static WebDriver driver;
	
	@FindBy(xpath="(//div[@class='select2-search'])[1]/input")
	private WebElement hotelSearchCity;
	
	@FindBy(xpath="//input[@class='form input-lg dpd1']")
	private WebElement checkInDate;
	
	@FindBy(xpath="(//div[@class='datepicker-days'])[1]/table/thead/tr[1]/th[3]")
	private WebElement checkInNextMonth;
	
	@FindBy(xpath="(//div[@class='datepicker-days'])[1]/table/tbody/tr[1]/td[7]")
	private WebElement checkInDay;
	
	@FindBy(xpath="//input[@class='form input-lg dpd2']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="(//div[@class='datepicker-days'])[2]/table/thead/tr[1]/th[3]")
	private WebElement checkOutNextMonth;
	
	@FindBy(xpath="(//div[@class='datepicker-days'])[2]/table/tbody/tr[2]/td[5]")
	private WebElement checkOutDay;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")
	private WebElement hotelSearchButton;
	
	@FindBy(xpath="(//div[@class='col-md-6 col-xs-4 go-right'])[1]/div/h4/a/b")
	private WebElement hotelsList1;
	
	@FindBy(xpath="(//button[@class='btn btn-primary br25 loader loader btn-block'])[1]")
	private WebElement hotelDetails;
	
	@FindBy(xpath="(//div[@class='col-md-4 go-right'])[1]/div/h4/a/b")
	private WebElement roomList1;
	
	@FindBy(xpath="(//div[@class='control__indicator'])[1]")
	private WebElement selectTripleRoom;
	
	@FindBy(xpath="(//div[@class='control__indicator'])[2]")
	private WebElement superiorDouble;
	
	@FindBy(xpath="(//div[@class='control__indicator'])[3]")
	private WebElement oneBedroomApt;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement bookNowButton;
	
	@FindBy(xpath="(//label[@class='switch-light switch-ios'])[1]/span/span[1]")
	private WebElement extra1;
	
	@FindBy(xpath="(//label[@class='switch-light switch-ios'])[2]/span/span[1]")
	private WebElement extra2;
	
	@FindBy(xpath="(//label[@class='switch-light switch-ios'])[3]/span/span[1]")
	private WebElement extra3;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement confirmMyBooking;
	
	@FindBy(xpath="//button[@class='btn btn-default arrivalpay']")
	private WebElement payOnArrival;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement payNow;
	
	@FindBy(xpath="//select[@class='form-control form selectx']")
	private WebElement paymentMethod;
	
	@FindBy(xpath="//table[@id='invoiceTable']/tbody/tr[1]/td/div/b")
	private WebElement bookingStatus;
	
	
}
