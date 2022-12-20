package org.Hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtility.Webdriverutility;

public class Addemployeefiled {
	
	Webdriverutility web = new Webdriverutility();
	
	@FindBy(name="employee_companyid")
	private WebElement companyid;
	
	@FindBy(name="employee_firstname")
	private WebElement firstname;
	
	@FindBy(name="employee_lastname")
	private WebElement lastname;
	
	@FindBy(name="employee_middlename")
	private WebElement middlename;
	
	@FindBy(name="branches_datefrom")
	private WebElement datefrom;
	
	@FindBy(name="branches_recentdate")
	private WebElement recentdate;
	
	@FindBy(name="employee_branches")
	private WebElement branch;
	
	@FindBy(name="employee_department")
	private WebElement department;
	
	@FindBy(name="employee_position")
	private WebElement position;
	
	@FindBy(name="employee_contact")  
	private WebElement contact;       
	
	@FindBy(name="employee_sss")
	private WebElement sss;
	
	@FindBy(name="employee_tin")
	private WebElement tin;
	
	@FindBy(name="employee_hdmf_pagibig")
	private WebElement hdmf;
	
	
	@FindBy(name="employee_gsis")
	private WebElement gsis;
	
	@FindBy(xpath="//input[@type='file']")   
	private WebElement file; 				
	
	@FindBy(xpath="(//input[@type='file'])[2]")
	private WebElement filess;
	
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement clickingsubmitbtn;
	
	
	@FindBy(xpath="//a[contains(.,'Welcome!,')]")
	private WebElement clickinglogout1;
	
	@FindBy(xpath="//a[@class='dropdown-item'][2]")
	private WebElement clickinglogout2;
	
	
	

	
	
	
	
	 public Addemployeefiled(WebDriver dri)
	 {
		 PageFactory.initElements(dri, this);
	 }
	 
	 
	 
	 
	 
	 public void addingcomid( String text)
	 {
		 companyid.sendKeys(text);
	 }
		 
		 
	 public void addingfirstname( String text) {
		  firstname.sendKeys(text);
	 }
	 public void addinglastname( String text) {
		 lastname.sendKeys(text);
	 }
	 public void addingmiddlename( String text) {
		 middlename.sendKeys(text);
	 }
	 public void addingdatefrom( String text) {
		 datefrom.sendKeys(text);
	 }
	 public void addingrecentdate( String text) {
		 recentdate.sendKeys(text);
	 }
	 
	 public void branches(String text)
	 {
		 web.handlingdropdown(branch,text);
		 branch.click();
		 
	 }
	 public void departmentname(String text)
	 {
		 web.handlingdropdown(department,text);
		 department.click();
	 }
	 public void empPosition (String text)
	 {
		 position.sendKeys(text);
	 }
	 
	 public void empcontact (String text)
	 {
		 contact.sendKeys(text);
	 }
	 public void empsss (String text)
	 {
		 sss.sendKeys(text);
	 }
	 
	 public void emptin (String text)
	 {
		 tin.sendKeys(text);
	 }
	 public void emphdmf(String text)
	 {
		 hdmf.sendKeys(text);
	 }
	 public void empgsis(String text)
	 {
		 gsis.sendKeys(text);
	 }
	 public void empfile(String text)
	 {
		 file.sendKeys(text);
	 }
	 public void empfiless(String text)
	 {
		 filess.sendKeys(text);
	 }
	 public void  clickingsubmitbtn()
	 {
		 clickingsubmitbtn.click();
	 }
	 public void  clickinglogout1()
	 {
		 clickinglogout1.click();
	 }
	 
	 public void  clickinglogout2()
	 {
		 clickinglogout2.click();
	 }
	 
	//position contact sss tin
	// hdmf gsis file filess

	
	
	
}
