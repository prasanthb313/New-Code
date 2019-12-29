package com.pattern.programs;

public class StarPyramid {
public static void main(String[] args) {
	int space=4;
	int star=1;
	for(int k=0;k<5;k++) {
	for(int i=0;i<=space;i++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=star;j++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
	space--;
	star+=2;
}
}
}