package com.strings.pages;

public class PrintingOfHighestElementInArray {
public static void main(String[] args) {
	int a[]= {12,14,11,2,5,6,16};
	int max=a[0];
	int temp=0;
	int secondHighest=0;
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i]) {
			temp=max;
			max=a[i];
			secondHighest=temp;
	}
	}
	System.out.println("the highest element in the matrix is   "+max);
	System.out.println("the second Highest element in the matrix is  "+secondHighest);
}
}

