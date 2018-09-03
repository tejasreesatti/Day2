package com.capgemini.day2;

public class DiscountOnItem {

	public static double findDiscount(double itemValue) {
		// TODO Auto-generated method stub
		double discount = (double) (itemValue * 0.35);
		double newPrice = itemValue - discount;
		return newPrice;
	}

}
