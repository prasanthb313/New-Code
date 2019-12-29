package com.sample.pages;

public class SecondTest {
public static void main(String[] args) {
	//SecondTest.prasanth(313,"hanish");
	SecondTest.hanish(1,23,45,68,89,78,56);
}
public static void prasanth(int variable,String name) {
	System.out.println("roll number is "+variable  +"   name is  "+name);
}
public static void hanish(int... a) {
	for (int i = 0; i < a.length; i++) {
		System.out.println("my name is hanish and my roll number is "+a[i]);

	}
	}
}






