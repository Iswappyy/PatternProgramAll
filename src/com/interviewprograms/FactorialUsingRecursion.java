package com.interviewprograms;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int n = 5;
		int fact= factorialRecursion(n);
		System.out.println("The factorial of "+ n + " is: "+ fact);
		
	}
   static int factorialRecursion(int x) {
	   int f;
	   if(x == 0 || x == 1) {
		   return 1;
	   }
	   else {
		   f = x * factorialRecursion(x-1);
	   }
	   return f;
   }
}
