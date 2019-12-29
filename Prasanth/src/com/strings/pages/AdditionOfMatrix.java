package com.strings.pages;

public class AdditionOfMatrix {
public static void main(String[] args) {
	int a[][]={{1,2},{3,4}};
	int b[][]= {{1,2},{3,4}};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(a[i][j]+b[i][j]+"  ");
		}
		System.out.println("  ");
	}
}
}
