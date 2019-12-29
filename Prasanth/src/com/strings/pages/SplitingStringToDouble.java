package com.strings.pages;

import java.util.ArrayList;
import java.util.List;

public class SplitingStringToDouble {
@SuppressWarnings("unused")
public static void main(String[] args) {
	List<String> lst=new ArrayList<String>();
	lst.add("RS 2000.12");
	lst.add("RS 5000.25");
	lst.add("RS 10000.56");
	double sum=0;
	for(int i=0;i<lst.size();i++)
	{
		String str=lst.get(i);
		String array[]=str.split(" ");
		double price;
		for(int k=array.length-1;k>=0;k--)
		{
			 price=Double.parseDouble(array[k]);
			 sum=sum+price;
			break;
		}
	}
	System.out.println("the sum of the price of the product is   "+sum);
}
}

