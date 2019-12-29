package com.sample.pages;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(groups = {"smoke test"})
	public void login() {
		System.out.println("login test is getting executed........");
	}
	@Test(groups= {"regression"})
	public void signIn() {
		System.out.println("second regresion ");
	}
}




