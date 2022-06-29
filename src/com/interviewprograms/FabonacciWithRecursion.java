package com.interviewprograms;

public class FabonacciWithRecursion {
	static int n1= 0;
	static int n2 =1;
	static int n3 ;
	
	static void fabonaciRecursion(int count) {
		if(count >0) {
		
		n3 = n1 +n2;
		 n1 =n2;
		 n2 =n3;
		 
		System.out.print(" "+ n3);
		fabonaciRecursion(count-1);
	}
	}
	public static void main(String[] args) {
		int count =10;
		System.out.print(n1+ " "+ n2);
		fabonaciRecursion(count-2);
		
	}

}
