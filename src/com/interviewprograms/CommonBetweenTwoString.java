package com.interviewprograms;

import java.util.HashSet;

public class CommonBetweenTwoString {
	public static void main(String[] args) {
		String[] strArr1 = {"abc","pqr","xyz","mno","wxu"};
		String[] strArr2 = {"lmn","pqr","efg","abc","mno"};
		
		HashSet<String> hs = new HashSet<String>();
		
		for(int i=0 ; i<= strArr1.length-1; i++) {
			for(int j=0 ;j<= strArr2.length-1; j++) {
				if(strArr1[i].equals(strArr2[j])) {
					hs.add(strArr1[i]);
				
				}
			}
		}
		System.out.println("Duplicate in two String: "+hs);
	}

}
