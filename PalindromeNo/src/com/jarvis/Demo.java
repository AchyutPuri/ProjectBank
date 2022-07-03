package com.jarvis;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{
		
		//to check given no is palindrome or not
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		
		int org_n=no;
		int rev=0;
		
		while(no!=0)
		{
			rev=rev*10 + no%10;
			no=no/10;
		}
		
		System.out.println("reversed number is: "+rev);
		
		if(org_n==rev)
		{
			System.out.println("its palindrome no");
		}
		else
		{
			System.out.println("given no is not palindrome");
		}
		
	}

}
