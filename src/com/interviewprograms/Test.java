package com.interviewprograms;

import java.io.IOException;
import java.util.EmptyStackException;

class Helper
{
	public static void main(String[] args) {
		int v = 3;
		int s = 6 + --v;
		int data = --v + ++v/s++* v++ + ++s % v-- ;   
		System.out.println(data);
	}
}

