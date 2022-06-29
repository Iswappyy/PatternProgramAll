package com.interviewprograms;

public class DuplicateIntArray {
	public static void main(String[] args) {
		int[] arr = {67,20,13,67,23,76,23,76,15};
		
		
		for(int i=0 ; i<= arr.length-1 ;i++) {
			for(int j=i+1 ; j<=arr.length-1 ;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
			
		}
		
	}

}
