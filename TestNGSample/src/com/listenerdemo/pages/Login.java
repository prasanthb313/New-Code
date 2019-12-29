package com.listenerdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.listenerdemo.pages.Listener.class)
public class Login {

	static WebDriver driver=new ChromeDriver();
	@Test
	public void login() {
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='s']"));
		Reporter.log("output method is getting executed......");
	}
	public void testToFail() {
		System.out.println("this is test is failed.........");
		Assert.assertTrue(false);
	}
}



