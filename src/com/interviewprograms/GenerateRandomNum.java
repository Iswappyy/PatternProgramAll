package com.interviewprograms;

public class GenerateRandomNum {
	public static void main(String[] args) {
		int min =200;
		int max =400;
		double a = Math.random()*(max - min +1)+min;
		System.out.println("Random num: "+a );
	}

}
