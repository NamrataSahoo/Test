package com.doit.ps;

import java.util.Scanner;

public class RemoveChar {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter char to be removed");
	char remove=scanner.nextLine().charAt(0);
	String origString="iamalady";
	String newString="";
	for(int i=0;i<origString.length();i++)
	{
		if(origString.charAt(i)==remove)
		{
			continue;
		}
		newString= newString+origString.charAt(i);
	}
	System.out.println("newString" + newString);
}
}
