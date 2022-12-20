package org.Hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.Webdriverutility;
public class Commonpage {
	
	      WebDriver dri;
	      Webdriverutility webbb = new   Webdriverutility();

          public String dynamicxpath="//label[text()(.,'%S')";
          @FindBy(xpath="EMPOS")
          private WebElement firstname;
          
          
          
          public Commonpage(WebDriver dri)
          {
        	  this.dri=dri;
        	  PageFactory.initElements(dri, this);
          }
          
          public void clickrequiredtab(String adddetails,Webdriverutility webdriverutility)
          {
        	  webbb.convertdyamicelementtowebelement(Addingdetailss.EMPCON.getdetails(), dri).click();
          }
}