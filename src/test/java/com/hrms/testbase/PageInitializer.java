package com.hrms.testbase;

import com.hrms.pages.AddEmergencyContactPage;
import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass{

	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;
	protected static AddEmergencyContactPage emrContacts;
	
	public static void initializeAllPage() {
		 login = new LoginPageElements();
		 dashboard = new DashboardPageElements();
		 pdetails  = new PersonalDetailsPageElements();
		addEmp =  new AddEmployeePageElements();
		emrContacts = new AddEmergencyContactPage();
		 
		 
	}
}
