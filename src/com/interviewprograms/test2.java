package com.interviewprograms;

import java.util.Arrays;

public class test2 {
	public static void main(String[] args) {
		int [] arr = {2,7,4,5,8};
		
		int [] arr2 = new int [10];
		int temp = 0;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<=9 ;i++) {
			int count =0;
			
			for(int j=0 ; j <= arr.length-1; j++) {
				if(i == arr[j]) {
					count ++;
					arr2[temp++] = arr[j];
					break;
			
				}
			}
			if(count == 0) {
				arr2[temp++] = i;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
	}
}
