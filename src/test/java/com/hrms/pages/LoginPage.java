package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.testbase.BaseClass;

public class LoginPage extends BaseClass{
	//login page contains the WebElement that will get pass on to commonMethods methods for loginpagetest execution
	//public access modifier gives accessability to the code
public WebElement username = driver.findElement(By.id("txtUsername"));
public WebElement password = driver.findElement(By.id("txtPassword"));
public WebElement loginBtn = driver.findElement(By.id("btnLogin"));
public WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
//public WebElement errMSg = driver.findElement(By.xpath("//span[@id='spanMessage']"));

//this public access modifier allows the code to accessible to other packages
//accessible to the ENTIRE PROJECT
//without the public access modifier it is at default and is only accesible inside the class

}
