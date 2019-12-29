package com.abstraction.pages;

public abstract class Program1 {
  public  abstract void googleSearch();
  public abstract void facebookSearch();
  public void login() {
	  System.out.println("my name is hanish........... ");
  }
}
 class Search extends Program1
 {
	@Override
	public void googleSearch() {
		System.out.println("google search method is executed.....");
	}

	@Override
	public void facebookSearch() {
		System.out.println("facebook method is executed............");
	}
	public void testExecution() {
		System.out.println("test execution is getting executed.......");
	}
 }