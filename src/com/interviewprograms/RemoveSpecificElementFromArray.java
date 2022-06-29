package com.interviewprograms;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {
	
	public static void main(String[] args) {
		int [] arr = {20,13,67,23,76,15};
		int index = 2;
		System.out.println("Before removing Element:" + Arrays.toString(arr));
		for(int i = index;  i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		System.out.println("After removing Element:" + Arrays.toString(arr));
		
	}
    
}
