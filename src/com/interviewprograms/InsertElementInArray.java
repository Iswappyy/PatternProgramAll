package com.interviewprograms;

import java.util.Arrays;

public class InsertElementInArray {
	public static void main(String[] args) {
		int[] arr = {20,13,67,23,76,15};
		int index_insert = 2;
		int newValue = 44;
		for(int i=arr.length-1 ; i >index_insert ; i--) {
			arr[i] = arr[i-1];
			arr[index_insert] = newValue;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
