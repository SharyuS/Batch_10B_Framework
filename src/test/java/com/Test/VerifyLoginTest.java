package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass {

	@Test
	public void verify_tc_01_withvalidlogincredential() {
		LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
	//	login.getTxt_emailID().sendKeys("BugSpotter");
	//	login.getTxt_password().sendKeys("12345678");
	//	login.getBtn_login().click();
		
		Library.custom_sendkeys(login.getTxt_emailID(), excel.getStringData("Sheet1", 0, 0), "emailID");
		Library.custom_sendkeys(login.getTxt_password(), excel.getStringData("Sheet1", 0, 0), "password");
		Library.custom_click(login.getBtn_login(), "login");
	}
}
