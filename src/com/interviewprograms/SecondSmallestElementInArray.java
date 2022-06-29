package com.interviewprograms;

public class SecondSmallestElementInArray {
	public static void main(String[] args) {
    int arr[] = {12,10,36,15,18,19,11,20};
    
    int k=2;
    
    for(int i=0; i<arr.length ; i++) {
    	for(int j=i+1 ; j<arr.length ;j++) {
    		if(arr[i] > arr[j]) {
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    			
    		}
    	}
    	if(i == k-1) {
    		System.out.println(k + "nd smallest element is: "+ arr[i]);
    	}
    }
}
}
