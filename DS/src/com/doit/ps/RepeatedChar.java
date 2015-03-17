package com.doit.ps;

import java.util.ArrayList;
import java.util.List;

public class RepeatedChar {
	public static void main(String[] args) {
		String s1="masiamalady";
		boolean nonRepeated=false;
		char nonRepeatedchar='\0';
		List letterArray= new ArrayList();
		for(int i=0;i<s1.length();i++)
		{
			letterArray.add(i, s1.charAt(i));
		}
		System.out.println(letterArray);
		for(int i=0 ; i<s1.length();i++)
		{
			if(letterArray.contains(s1.charAt(i)) )
			{
				continue;
				
			}
			nonRepeatedchar=s1.charAt(i);
		}
		System.out.println(nonRepeatedchar);
	}

}
