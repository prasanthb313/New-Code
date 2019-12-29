package com.pattern.programs;

public class AlphabatesProgram {
public static void main(String[] args) {
	char end='E';
	for(char start='A';start<=end;start++)
	{
		for(char ch='A';ch<=start;ch++)
		{
			System.out.print(ch+" ");
		}
		System.out.println(" ");
	}
}
}

