package com.pattern.programs;

import org.testng.annotations.Test;

public class Patterns {
	
	@Test(enabled=true)
	public void pattern1()
	{
		int num=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(num+"      ");
				num++;
			}
			System.out.println(" ");
		}	
	}
	@Test(enabled=true)
	public void pattern2()
	{
		for(int i=5;i>0;i--)
		{
			int num=1;
			for(int j=i;j>0;j--)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
	}
	@Test(enabled=true)
	public void pattern3()
	{
		for(int i=5;i>0;i--)
		{
			int num=5;
			for(int j=i;j>0;j--)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println(" ");
		}
	}
}























