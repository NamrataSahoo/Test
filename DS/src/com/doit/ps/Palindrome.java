package com.doit.ps;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//String s1="babccbab";
		//StringBuilder s2=new StringBuilder(s1);
		
		/* with reverse function*/
		/*StringBuilder s2=new StringBuilder(s1);
		StringBuilder s3= s2.reverse();
		if(s2.equals(s3))
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");*/

		boolean palindrome=false;
		/*for(int i=1;i<s2.length();i++)
		{
			for(int j=s2.length();j>0;j--)
			{
				if(s2.charAt(i)==s2.charAt(j-1))
				{
					System.out.println( s2.charAt(j-1) + ""+ s2.charAt(i));
					palindrome=true;
				}
				else
				{
					palindrome=false;
				}
			}
		}
			System.out.println("is palindrome?" + palindrome);*/
		
		/* 
		String reverse="";
		for(int i=s1.length()-1;i>-1;i--)
		{
			reverse= reverse +s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(reverse);
		if(s1.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
			*/
		
		String s1;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string");
	    s1 = in.nextLine();
		int end=s1.length()-1;
		int begin=0;
		int mid=(begin+end)/2;
		for(int i=0;i<=mid;i++)
		{
			if(s1.charAt(begin)==s1.charAt(end))
			{
				begin++;
				end--;
			}
			else
				break;
		}
		if(begin==mid+1)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
}

}
