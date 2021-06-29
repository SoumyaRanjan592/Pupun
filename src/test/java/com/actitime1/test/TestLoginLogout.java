package com.actitime1.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime1.generics.BaseTest;
import com.actitime1.pom.ActitimeHomePage;
import com.actitime1.pom.ActitimeLoginPage;

public class TestLoginLogout extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
	login.loginMethod();
	ActitimeHomePage home=new ActitimeHomePage(driver);
	home.logoutMethod();
	}

}
