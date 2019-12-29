package com.sample.pages;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(enabled=true)
	public void login() {
		System.out.println("login page is executed.........");
	}
	@Test(enabled=false)
	public void signIn() {
		System.out.println("sign in page is getting executed.........");
	}
}




