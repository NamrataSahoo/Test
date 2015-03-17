package com.doit.ps;

import java.util.Scanner;

public class NumPalindrome {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter a no");
		String inputno= scanner.nextLine();
		Integer no= Integer.parseInt(inputno);
		int number=no;
		int reminder;
		int reverse=0;
		while(no>0)
		{
			reminder=no%10;
			reverse=reverse*10+reminder;
			no=no/10;
		}
		if(number==reverse)
			System.out.println("palindrome" + reverse);
		System.out.println(reverse);
	}
	
	

}
