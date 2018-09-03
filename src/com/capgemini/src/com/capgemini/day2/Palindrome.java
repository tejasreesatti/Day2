package com.capgemini.day2;

public class Palindrome {

	public static int findPalindrome(int num) {
		int temp = num;
		int reverse = 0;
		int remain;
		while(num > 0) {
			remain = num % 10;
			reverse = (reverse * 10) + remain;
			num /= 10;
		}
		
		if(temp == reverse) {
			return 1;
		}
		else {
			return 0;
		}
		
		// TODO Auto-generated method stub
	
	}

}
