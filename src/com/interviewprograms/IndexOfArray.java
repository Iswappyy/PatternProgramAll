package com.interviewprograms;

public class IndexOfArray {
	
	public static int indexOf(int[] arr,int j) {
		if(arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;
		while(i<len) {
			if(arr[i] == j) {
				return i;
			}
			else
				i++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {20,13,67,23,76,15};
		
		System.out.println("Index of number 67 is: " + indexOf(arr,67));
		System.out.println("Index of number 100 is: " + indexOf(arr,100));
	}

}
