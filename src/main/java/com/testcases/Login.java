package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrms.pages.Loginpage;

import utils.Apputils;

public class Login extends Apputils {
	
	public WebDriver driver;
	
	@Test
	/*public void loginTest() {
	Loginpage lp=new Loginpage(driver);
	lp.login("Admin","Qedge123!@#");
	}*/
	
	
	public void loginTest1() {
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		lp.login("Admin","Qedge123!@#");
	}
	
}
