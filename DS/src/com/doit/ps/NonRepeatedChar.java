package com.doit.ps;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatedChar {
	public static void main(String[] args) {
		String s1="masiamalady";
		boolean repeated=false;
		char repeatedchar='\0';
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
				repeated=true;
				repeatedchar=s1.charAt(i);
				break;
			}
		}
		System.out.println(repeatedchar);
	}

}
