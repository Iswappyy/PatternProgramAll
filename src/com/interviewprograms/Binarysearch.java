package com.interviewprograms;

public class Binarysearch {
	public static void BinarySearch(int arr[],int first,int last,int key) {
		int mid = (first + last)/2;
		
		while(first <= last) {
			if(arr[mid] < key) {
				first =  mid + 1;
			}
			else if(arr[mid]==key) {
				System.out.println("The required num index is: "+ mid);
				break;
			}
			else
			{
				last = mid - 1;
			}
			mid = (first + last)/2;
		}
		if(first > last) {
			System.out.println("Element not found...!");
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int last =arr.length-1;
		int key = 40;
		BinarySearch(arr,0,last,key);
		
	}

}
