package com.pattern.programs;

public class Inverted {
public static void main(String[] args) {
	int n=10;
	int space=(n-1)/2;
	int star=1;
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=space;j++)
			System.out.print(" ");
		for(int k=1;k<=star;k++)
			System.out.print("*");
		if(i<(n+1)/2)
		{
			space--;
			star+=2;
		}
		else {
			space++;
			star-=2;
		}
		System.out.println(" ");
	}
}
}









