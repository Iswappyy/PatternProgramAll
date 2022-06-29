package com.interviewprograms;

public class DuplicateStringArray {
	public static void main(String[] args) {
		String[] strArr = {"abc","pqr","xyz","abc","pqr"};
		
		for(int i=0; i<=strArr.length-1 ;i++) {
			for(int j = i+1; j<=strArr.length-1 ;j++) {
				if(strArr[i].equals(strArr[j]) && i != j) {
					System.out.println(strArr[i]);
				}
			}
		}
	}

}
