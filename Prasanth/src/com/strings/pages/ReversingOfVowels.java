package com.strings.pages;

import java.util.ArrayList;
import java.util.List;

public class ReversingOfVowels {
public static void main(String[] args) {
	String str="This is sentence";
	int num=0;
	List<Character> list=new ArrayList<Character>();
	for (int i =str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			list.add(ch);
		}
	}
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.print(list.get(num));
		    num++;
		}
		else
			System.out.print(str.charAt(i));
	}
	System.out.println("my name is prasanth");
	System.out.println("my friend name is srinivas");
}
}
