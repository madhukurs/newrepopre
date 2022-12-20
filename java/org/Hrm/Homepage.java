package org.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.Webdriverutility;

public class Homepage {
	Webdriverutility webb = new Webdriverutility();
	
	
	@FindBy(xpath="(//a[(@class='nav-link')])[7]")
	private  WebElement employeefiled ;
	
	@FindBy(xpath="(//a[(@class='nav-link')])[8]")
	private  WebElement addemployeefield;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private  WebElement addemployeebutton;
	
	
	@FindBy (xpath="//p[contains(text(),'BRANCHES')]")
	private WebElement branches;
	 
	@FindBy(xpath="//p[contains(text(),'Add Braches')]")
	private WebElement addbranches;
	
	@FindBy(xpath="//p[contains(text(),'CORPORATE')]")
	private WebElement corporate;
	
	@FindBy(xpath="//p[contains(text(),'Add Corporate')]")
	private WebElement addcorporate;
	
	@FindBy(xpath="//td[text()='Risk dept']/ancestor::tr//button/..//button[text()='Delete']")
	private WebElement deletecorporate;
	
	
	@FindBy(xpath="//p[contains(text(),'ADMIN')]")
	private WebElement admin;
	
	@FindBy(xpath="//p[contains(text(),'Add Admin')]")
	private WebElement addadmin;
	
	
	@FindBy(xpath="//th[text()='HR CompanyID']/ancestor::table[@id='example1']//thead//th[text()='HR CompanyID']/ancestor::table[@id='example1']//tbody//td[text()='1001']/..//i[@title='Delete Employee']")
	private WebElement deleteadmin;
	
	
	@FindBy(xpath="//h4[text()='Delete Admin']//ancestor::div[@class='modal fade show']//button[text()='Delete']")
	private WebElement deleteconfirm;
	
	
	
	
	
	
	
	public Homepage (WebDriver dri)
	{
		PageFactory.initElements(dri, this);
	}
	

	public void MouseHover(WebDriver dri)
	{
		webb.MouseHoverAction(dri,employeefiled);
		employeefiled.click();
		webb.MouseHoverAction(dri,addemployeefield);
		addemployeefield.click();
		webb.MouseHoverAction(dri,corporate);
		corporate.click();
		
		
		
		
	}
	public void addbutton()
	{
		addemployeebutton.click();
	}
	
	public void MouseHover1(WebDriver dri)
	{
		webb.MouseHoverAction(dri,branches);
		branches.click();
		webb.MouseHoverAction(dri,addbranches);
		addbranches.click();
		
	}
	public void MouseHoveradmin(WebDriver dri)
	{
		webb.MouseHoverAction(dri,admin);
		admin .click();
	}
	
	
	
	public void corporatebut()
	{
		corporate.click();
	}
	public void clickaddcorporate()
	{
		addcorporate.click();
	}
	public void deletecorporatebtn()
	{
		deletecorporate.click();

	}
	public void MouseHover3(WebDriver dri)
	{
		webb.MouseHoverAction(dri,corporate);
		corporate.click();
	}
	
	public void deleteadmin()
	{
		admin.click();
		addadmin.click();
		deleteadmin.click();
		deleteconfirm.click();
	}
	

}
