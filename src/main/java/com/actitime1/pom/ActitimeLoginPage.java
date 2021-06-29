package com.actitime1.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime1.generics.AutoConstant;
import com.actitime1.generics.ExcelLibrary;

public class ActitimeLoginPage implements AutoConstant
{
@FindBy(id="username")
private WebElement usernameTextfield;

@FindBy(xpath="//input[@name='pwd']")
private WebElement passwordTextfield;

@FindBy(id="keepLoggedInCheckBox")
private WebElement keepmelogginCheckbox;

@FindBy(id="loginButton")
private WebElement loginButton;

@FindBy(xpath="//a[.='Forgot your password?']")
private WebElement forgotpasswordLink;

@FindBy(xpath="//a[.='actiTIME Inc.']")
private WebElement actitimeincLink;



public ActitimeLoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void loginMethod() throws InterruptedException, IOException
{
	 usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 0));
	 passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 1));
	 keepmelogginCheckbox.click();
	 loginButton.click();
	 Thread.sleep(3000);
	}
public void forgotyourpasswordMethod()
{
	forgotpasswordLink.click();
}
public void actitimeincMethod()
{
	actitimeincLink.click();
	}
}


	
	
	
	

