package com.interviewprograms;

public class reverseArray {
	public static void main(String[] args) {
		int[] arr = {20,13,67,23,76,15};
		
//		for(int i=0 ; i<=arr.length-1 ;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("*********Reverse array is*******");
		for(int i = arr.length-1 ; i>=0 ; i--) {
			System.out.print( arr[i]+ " ");
		}
	}

}
