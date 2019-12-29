package com.strings.pages;

public class SortingArrayInAscendingOrder {
public static void main(String[] args) {
	int array[]= {16,14,1,2,3,4,5,6,7,8,9,10,11,12,13,15};
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
}
}

