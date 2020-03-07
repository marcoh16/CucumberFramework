package com.hrms.steps;

import org.openqa.selenium.WebElement;

import com.hrms.pages.AddEmergencyContactPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmergencyContactsteps extends CommonMethods {


	@When("I click on PIM")
	public void i_click_on_PIM() throws InterruptedException {
	click(emrContacts.PIM);
		
	
	}

	@When("I locate employee with ID and click search")
	public void i_locate_employee_with_ID_and_click_search() {
		emrContacts =new  AddEmergencyContactPage();
		sendText(emrContacts.id, "9009");
		click(emrContacts.SearchBtn);
	}

	@When("I click on employee")
	public void i_click_on_employee() {

	}

	@When("I click on emergency contact")
	public void i_click_on_emergency_contact() {
	  
	}

	@When("I click on Add")
	public void i_click_on_Add() {

	}

	@When("I fill out contact information")
	public void i_fill_out_contact_information() {
	 
	}

	@Then("I click save")
	public void i_click_save() {
	 
	}


	
	
	
	
}
