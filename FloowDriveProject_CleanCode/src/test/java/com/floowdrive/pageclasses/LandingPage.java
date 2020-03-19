package com.floowdrive.pageclasses;


import org.openqa.selenium.WebElement;

import com.floowdrive.base.BasePage;

import io.appium.java_client.AppiumDriver;


public class LandingPage  extends BasePage{
	
	/** constructor 
	 * **/
	public LandingPage(AppiumDriver<WebElement> driver) {
		super(driver);
		this.driver = driver;
	}

	/***
     * Variables
     * Locators
     * URL
     */
	
	
    private String EMAIL_FIELD = "com.thefloow.thefloowltd.floowdrive.app:id/register_email_address";
    private String PASSWORD_FIELD = "com.thefloow.thefloowltd.floowdrive.app:id/register_password";
    private String REPEAT_PASSWORD_FIELD = "com.thefloow.thefloowltd.floowdrive.app:id/register_confirm_password";
	

	public void do_registration (String email,String password,String retype_password) throws InterruptedException {
		//given some waiting time for seeing action 
		Thread.sleep(10000);
		sendData(EMAIL_FIELD,email,"EMAIL_FIELD");   
		
		//given some waiting time for seeing action
		Thread.sleep(10000);
		sendData(PASSWORD_FIELD,password,"PASSWORD_FIELD");  
		
		//given some waiting time for seeing action
		Thread.sleep(10000);
		sendData(REPEAT_PASSWORD_FIELD,retype_password,"REPEAT_PASSWORD_FIELD");
		
	}
	
	
	public void already_regitered_goto_loginPage()  {
		
		
		// need to add codes for loginpage
				
	}
	
	

}
