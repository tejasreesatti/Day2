package com.capgemini.day2;

public class BubbleSort {
public static int[] bubbleSort( int[] input) {
		// TODO Auto-generated method stub
			
			int i, j, temp;
			for(i = 0; i < input.length; i++) {
				for(j = 0; j < input.length-1-i; j++) {
					if(input[j] > input[j+1]) {
						temp = input[j+1];
						input[j+1] = input[j];
						input[j] = temp;
					}
				}
			}
			
		
		return input;
	}

}
