package com.actitime1.generics;

import java.sql.Driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
@BeforeMethod
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}
@AfterMethod
public void teardown()
{
	//driver.quit();
}

}
