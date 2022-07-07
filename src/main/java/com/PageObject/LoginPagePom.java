package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePom {
	
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	private WebElement Txt_emailID;
	
	@FindBy(how=How.XPATH, using="//input[@name='pass']")
	private WebElement Txt_password;
	
	@FindBy(how=How.XPATH, using="//button[@name='login']")
	private WebElement Btn_login;
	
	public WebElement getTxt_emailID() {
		return Txt_emailID;
	}

	public WebElement getTxt_password() {
		return Txt_password;
	}

	public WebElement getBtn_login() {
		return Btn_login;
	}


}
