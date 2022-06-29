package com.interviewprograms;

import java.util.Arrays;

public class ClassDemoProg {
	
	public static void main(String[] args) {
		
		String s = "my name is Swapnil and my  class name is java";
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str)+ " , ");
		
		for(int i=0 ; i<str.length ; i++) {
			int count = 0;
			for(int j =0 ;j< str.length ;j++) {
				if(str[i].equals(str[j])) {
					count++;
				}
			}
			for(int k = i ; k>0 ;k--) {
				if(str[k].equals(str[k-1])) {
					count =0;
				}
			}
			//Formatter fmt = new Formatter();  
			if(count >= 1) {
				System.out.println(str[i] +  "  "  + count);
				
			}
			
		}
		
	}

}
