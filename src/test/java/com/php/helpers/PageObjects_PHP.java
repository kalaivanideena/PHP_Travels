package com.php.helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.php.pom.PHP_Login;

public class PageObjects_PHP {

	private WebDriver driver;
	private PHP_Login lo;
	
	public PHP_Login getLo() {
		return (lo == null) ? lo = new PHP_Login(driver) : lo;
	}
	
	public PageObjects_PHP(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
}
