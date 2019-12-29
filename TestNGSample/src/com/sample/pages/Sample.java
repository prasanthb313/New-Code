package com.sample.pages;

import org.testng.annotations.Test;

public class Sample {

	@Test(groups= {"smoke test"})
	public void test() {
		System.out.println("first smoke test is getting executed..............");
	}
	@Test(groups= {"regression"})
	public void login() {
		System.out.println("first regression.........");
	}
}


