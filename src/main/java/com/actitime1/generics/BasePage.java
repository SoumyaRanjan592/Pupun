package com.actitime1.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void gettext(WebElement element)
	{
		System.out.println(element.getText());
	}
	public void selectbyvisibletext(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void movetoelement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void robottab() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
	public void alertaccept(WebDriver driver)
	{
    Alert alt=driver.switchTo().alert();
    System.out.println(alt.getText());
    alt.accept();
}
}
