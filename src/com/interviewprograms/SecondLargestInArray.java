package com.interviewprograms;

import java.util.Arrays;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int [] arr = {20,13,67,23,76,15};
				Arrays.sort(arr);
				
				System.out.println("Second largest num is: " + arr[arr.length-2]);
		}
	}


