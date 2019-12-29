package com.pattern.programs;

public class InvertedStar {
public static void main(String[] args) {
	int rows=10;
	int space=(rows-1)/2;
	int star=1;
	for(int k=0;k<=rows;k++) 
	{
	    for(int i=0;i<=space;i++)
	      {
	          System.out.print(" ");
	      }
	    for(int j=1;j<=star;j++)
	      {
		      System.out.print("*");
	      }
	   if(k<(rows+1)/2)
	   {
		   star+=2;
		   space--;
	   }
	   else 
	   {
		   star-=2;
		   space++;
	   }
	   System.out.println(" ");
}
}
}

