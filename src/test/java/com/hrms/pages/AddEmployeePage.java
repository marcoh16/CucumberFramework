package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
	@FindBy(linkText = "PIM")
	public WebElement pim;

	@FindBy(linkText = "Add Employee")
	public WebElement addingEmp;

	public AddEmployeePage() {
		PageFactory.initElements(BaseClass.driver, this);

	
	}
	//method to easyly navigate to adding emp
	public void navigateToAddEmployee() {
		click(pim);
		click(addingEmp);
	}
}
