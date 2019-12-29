package com.sample.pages;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners
public class ScreenShot {

	@Test
	public void screenShot() {
		int sum=0;
		int a=9;
		int b=8;
		System.out.println(sum=a+b);
		System.out.println("first method is getting executed........");
	}
	@Test
	public void login() {
		System.out.println("first test is getting failed........");
		Assert.assertTrue(true);
	}
}






