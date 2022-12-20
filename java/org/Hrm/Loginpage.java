package org.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.IconstantPath;
import GenricUtility.PropertyFile;
import GenricUtility.Webdriverutility;

public class Loginpage {
	
	Webdriverutility dr = new Webdriverutility();

	@FindBy(name="hr_email")
	private WebElement username;
	  
	
	@FindBy(name="hr_password")
	private WebElement password;
	
	@FindBy(id="hr_type")
	private WebElement Hrtype;
	
	@FindBy(name="login_hr")
	private WebElement loginbut;
	
	

	

	public  Loginpage( WebDriver dri)
	{
		PageFactory.initElements(dri,this);
	}
	
	
	
	public void usernametextbox(String Hrmail)
	{
		username.sendKeys(Hrmail);
		
		
	}

	public void passwordtextbox(String password1)
	{
		password.sendKeys(password1);
		
		
	}
	
	public void Hrtypedropdown(String visibletext) 
	{
		 dr.handlingdropdown(Hrtype,visibletext);
		
		
	}
	public void loginbutton()
	{
		loginbut.click();
	}
	
	
	public void loginaction (String username1,String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
	}

}
