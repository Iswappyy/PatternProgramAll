package com.interviewprograms;

import java.util.Arrays;

public class GetMaxMinNumFromArray {
	public static void main(String[] args) {
		int [] arr = {20,13,67,23,76,15};
		int max = arr[0];
		int min = arr[0];
		for(int i=1 ; i<arr.length-1 ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max num from array is : "+ max);
		System.out.println("Min num from array is : "+ min);
		
		
	}
	
	
	}

