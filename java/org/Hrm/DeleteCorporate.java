package org.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class  DeleteCorporate {
	
	@FindBy(xpath="//div[@class='modal fade show']//div[@class='modal-header']/following-sibling::div[@class='modal-footer justify-content-between']//button[@type='submit']")
	 private WebElement deletebtn;
	
	
	public DeleteCorporate(WebDriver dri)
	{
		PageFactory.initElements(dri, this);
	}
	
	
	public void deleteconfr()
	{
		deletebtn.click();
	}

}
