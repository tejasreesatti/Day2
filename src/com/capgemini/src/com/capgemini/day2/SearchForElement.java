package com.capgemini.day2;

public class SearchForElement {

	public static String ElementSearchInArray(int[][] array, int search) {
		// TODO Auto-generated method stub
		String Exist = "";
		String NonExist = "";
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				if (array[i][j] == search) {
					Exist = "Element exists in the Array";
					return Exist;
				}
			}
		}
		NonExist = "Element does not exists in the Array";
		return NonExist;
	}

}
