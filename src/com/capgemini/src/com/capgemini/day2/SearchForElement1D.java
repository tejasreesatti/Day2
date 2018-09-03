package com.capgemini.day2;

public class SearchForElement1D {

	public static String ElementSearchInArray1D(int[] array, int search) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++) {
			if(array[i] == search) {
				String found = "Element exists in the array";
				return found;
			}
		}
		String notFound = "Element doesnot exist in the array";
		return notFound;
	}

}
