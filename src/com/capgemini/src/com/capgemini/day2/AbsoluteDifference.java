package com.capgemini.day2;

public class AbsoluteDifference {

	public static int findAbsoluteDifference(int size,int[] input, int k) {
		// TODO Auto-generated method stub
		for(int i = 0; i < input.length - 1; i++) {
			for(int j = i+1; j < input.length; j++) {
				if(Math.abs(i - j) <= k)
				{
					if(input[i] == input[j]) {
						System.out.println("The pair exists at "+(i + 1)+" and "+(j+1));
						return 1;
					}
				}
			}
		}
		return 0;
		
	}
}
