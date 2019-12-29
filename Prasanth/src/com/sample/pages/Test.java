package com.sample.pages;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	int array[][]=new int[3][3];
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the elements into the matrix");
	System.out.println(array.length);
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array.length;j++)
		{
			array[i][j]=scan.nextInt();
		}
	}
	System.out.println("the elements in the matrix are");
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array.length;j++)
		{
			System.out.print("  "+array[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}



