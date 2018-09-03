package com.capgemini.day2;

public class ArmstrongTest {

	public static boolean checkArmstrong(int number) {
		int temp = number;
		int remainder;
		int sum = 0;
		while(number != 0) {
			remainder = number % 10;
			sum  = sum + remainder * remainder * remainder;
			number /= 10;
		}
		if(temp == sum) {
			return true;
		}
		else {
			return false;
		}
		
		// TODO Auto-generated method stub
	
	}
	

}
