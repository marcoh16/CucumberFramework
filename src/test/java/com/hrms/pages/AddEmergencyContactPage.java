package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmergencyContactPage extends CommonMethods {
	@FindBy(linkText = "PIM")
	public WebElement PIM;
	
	@FindBy(xpath="//input[@id='empsearch_id']")
	public  WebElement id;
	
	@FindBy(xpath = "//input[@id='searchBtn']")
	public  WebElement SearchBtn;
	
	//make sure to click on this element 
	@FindBy(xpath="//a[contains(text(),'9009')]")
	public WebElement user;
	
	@FindBy(xpath = "//a[contains(text(),'Emergency Contacts')]")
	public WebElement EcontactBtn;
	
	@FindBy(id = "btnAddContact")
	public WebElement AddContactButton;
	
	@FindBy(id ="emgcontacts_name")
	public WebElement fName;
	
	@FindBy(id ="emgcontacts_relationship")
	public WebElement RelationShip;
	
	@FindBy(id ="emgcontacts_homePhone")
	public WebElement Homephone;
	
	@FindBy(id ="emgcontacts_mobilePhone")
	public WebElement Mobilephone;
	
	@FindBy(id = "emgcontacts_workPhone")
	public WebElement workPhone;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement SaveBtn;
	
	
	
	
	
	
	
	public AddEmergencyContactPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
