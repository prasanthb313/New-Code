package com.sample.pages;

import org.testng.annotations.Test;

public class Description {

	@Test(description = "this is test case1")
	public void test() {
		System.out.println("this is test case 1");
	}
	@Test(description="this is smoke test case")
	public void test2() {
		System.out.println("this is smoke test case");
	}	
}
