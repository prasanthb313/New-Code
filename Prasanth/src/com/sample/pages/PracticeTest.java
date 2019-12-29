package com.sample.pages;

public class PracticeTest {
public static void main(String[] args) {
	int i=0;
	int j=0;
	j=m1(i++)+m1(++i);
	System.out.println("i value is  "+i);
	System.out.println("j value is  "+j);
}
static int m1(int a) {
	return a;
}
}
