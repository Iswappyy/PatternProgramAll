package com.interviewprograms;

public class FabonacciWithaoutRecurtion {
	public static void main(String[] args) {
		int n1= 0;
		int n2= 1;
		int n3;
		int n =10;
		
		System.out.print(n1 + " " + n2);
		
		for(int i=2 ; i<n ;i++) {
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			
			n1 = n2;
			n2 =n3;
		}
	}

}
