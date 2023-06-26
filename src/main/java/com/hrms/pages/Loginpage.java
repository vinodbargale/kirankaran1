package com.hrms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	// create object repository	
	@FindBy(id = "txtUsername")
	WebElement uid_element;
	
	@FindBy(name = "txtPassword")
	WebElement pwd_element;
	
	@FindBy(xpath = "//*[@value='LOGIN']")
	WebElement login_element;
	
	@FindBy(linkText = "Admin")
	WebElement admin_link_element;
	
	@FindBy(partialLinkText = "Welcome")
	WebElement welcome_link_element;
	
	@FindBy(linkText = "Logout")
	WebElement logout_link_element;
	
	@FindBy(id = "spanMessage")
	WebElement errmsg_element;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	  public void login(String uid,String pwd) { uid_element.sendKeys(uid);
	  pwd_element.sendKeys(pwd); login_element.click();
	  
	  }
	 
}
