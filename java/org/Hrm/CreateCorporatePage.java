package org.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.Webdriverutility;

public class CreateCorporatePage {
	
	
		
		/**
		 * declare all the required element
		 */
		
		Webdriverutility  wdu = new Webdriverutility ();
		
	@FindBy(xpath="//p[contains(text(),'CORPORATE')]") private WebElement Corporatebtn;                                    
	@FindBy(xpath="//p[contains(text(),'Add Corporate')]")private WebElement AddCorporateRadiobtn;
	@FindBy(xpath="//button[contains(text(),'Add Corporate')]")private WebElement AddCorporatebttn;

	@FindBy(xpath="//div[@id='modal-overlay']//input[@name='corporate_name']")private WebElement CorporateName;
	@FindBy(xpath="//button[text()='Save']")private WebElement Savebtn;
	@FindBy(xpath="//p[text()='Dashboard']") private WebElement dashBoardbtn;
	@FindBy(xpath="//span[text()='Corporate']//following-sibling::span[@class='info-box-number']")private WebElement CorporateCount;

	/**
	 * 
	 * intial all the element
	 * @param driver
	 */

	public CreateCorporatePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void CorporateclickButton()
	{
		Corporatebtn.click();
		AddCorporateRadiobtn.click();
		AddCorporatebttn.click();
		
	}

	public void AddCorporateNameForm(String Corporatename)
	{
		CorporateName.sendKeys(Corporatename);

	}

	public void SaveFormbutton()
	{
		Savebtn.click();

	}

	public void CorporateCount()
	{
		//wdu.clickingusingJS(dashBoardbtn);
		dashBoardbtn.click();
			System.out.println(CorporateCount.getText());
		
	}



	}

