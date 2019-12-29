package com.strings.pages;

public class MultiplicationOfMatrix {
public static void main(String[] args) {
	int[][] lastArray=new int [2][2];
	int array1[][]= {{1,2},{3,4}};
	int array2[][]= {{1,2},{3,4}};
	for(int i=0;i<array1.length;i++)
	{
		for(int j=0;j<array1.length;j++)
		{
			for(int k=0;k<array1.length;k++)
			{
				lastArray[i][j]+=array1[i][k]*array2[k][j];
			}
		}
	}
	for(int i=0;i<lastArray.length;i++)
	{
		for(int j=0;j<lastArray.length;j++)
		{
			System.out.print(lastArray[i][j]+" ");
		}
		System.out.println("  ");
	}
}
}
