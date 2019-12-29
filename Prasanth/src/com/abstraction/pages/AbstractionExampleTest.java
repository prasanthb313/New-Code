package com.abstraction.pages;

import org.testng.annotations.Test;

public class AbstractionExampleTest{

	@Test
	public void search() {
		Search ref=new Search();
		ref.googleSearch();
		ref.facebookSearch();
	}
}
