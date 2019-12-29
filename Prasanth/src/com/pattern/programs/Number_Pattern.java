package com.pattern.programs;

public class Number_Pattern {
public static void main(String[] args) {
	int space=4;
	int num=1;
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print(num+" ");
			num++;
		}
		System.out.println(" ");
	}
}
}
