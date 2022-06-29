package com.interviewprograms;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num =153;
		
		int temp1 = num;
		
		int count = 0;
		while(temp1 != 0) {
			
			temp1=temp1/10;
			count++;
		}
		int temp2 = num;
		int add = 0;
		int rem;
		while(temp2 != 0) {
			rem = temp2%10;
			int mult = 1;
			for(int i =1;i<=count ;i++) {
				mult = mult * rem;
			}
			add = add + mult;
			
			temp2 = temp2/10;
			
		}
		if(num == add) {
			System.out.println(num+" is armstrong number");
		}
		else {
			System.out.println(num +" is not armstrong number");
		}
	}

}
