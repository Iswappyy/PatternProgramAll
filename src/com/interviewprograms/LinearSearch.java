package com.interviewprograms;

public class LinearSearch {
	public static int linearSearch(int [] arr ,int key) {
		for(int i=0;i< arr.length ; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30,50,70,90};
		int key = 70;
		
		System.out.println(key + " Found at index of "+ linearSearch(arr,key));
		
	}

}
