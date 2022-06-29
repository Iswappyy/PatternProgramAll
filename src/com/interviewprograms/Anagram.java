package com.interviewprograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "HEART";
		String s2 = "EARTH";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean compareString = Arrays.equals(ch1, ch2);
		if(compareString) {
			System.out.println(s1+ " String and "+ s2 + " String are anagram" );
		}
		else
		{
			System.out.println(s1+ " String and "+ s2 + " String are not anagram" );
		}
	}

}
