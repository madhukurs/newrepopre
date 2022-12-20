package org.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.Webdriverutility;

public class Addbranches {

	
	Webdriverutility webb = new Webdriverutility();
	
	@FindBy(xpath="//button[contains(text(),'Add Branches')]")
	private WebElement clickonaddbranchbutton;
	
	@FindBy(xpath="//h4[contains(text(),'Add Branches')]/ancestor::div[@class='modal-content']//input[@name='branches_name']")
	private WebElement addingbranchname;
	
	@FindBy(xpath="//button[@name='bran']")
	private WebElement clickonsavebutton;
	
	public Addbranches(WebDriver dri)
	{
		PageFactory.initElements(dri, this);
	}
	
	public void addbranches()
	{
		clickonaddbranchbutton.click();
	}
	public void addbranchename(String branchnm)
	{
		addingbranchname.sendKeys(branchnm);
		
	}
	public void clicksavebutn()
	{
		clickonsavebutton.click();
	}
	
	
		
	}

