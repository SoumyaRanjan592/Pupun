package com.actitime1.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage
{

	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	
	  @FindBy(xpath="menu_icon") private WebElement Settingsbutton;
	  
	  @FindBy(id="logoutLink") private WebElement logoutLink;
	 
	public ActitimeHomePage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
	}

	  public void taskMethod() 
	  { 
		  taskButton.click(); 
		  }
	 
			
			  public void settingsMethod() { Settingsbutton.click(); }
			  
			  public void logoutMethod() {
			  
			  logoutLink.click(); 
			  }
			 
}
