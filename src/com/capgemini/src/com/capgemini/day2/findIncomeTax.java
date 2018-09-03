package com.capgemini.day2;

public class findIncomeTax {
	double taxable_amount (double salary) {
		double diff , tax;
		if(salary <= 180000) {
			tax = 0;
			return tax;
		}
		else if(salary >= 180001 && salary <= 300000) {
			diff = salary - 180000;
			tax = diff * 0.1;
			//System.out.println("The taxable amount is " +tax);
			return tax;
		}
		else if(salary >= 300001 && salary <= 500000) {
			diff = salary - 180000;
			tax = diff * 0.1;
			diff -= tax;
			tax += diff * 0.2;
			return tax;
			//System.out.println("The taxable amount is " +tax);
		}
		else {
			diff = salary - 180000;
			tax = diff * 0.1;
			diff -= tax;
			tax += diff * 0.2;
			diff -= tax;
			tax += diff * 0.3;
			return tax;
			//System.out.println("The taxable amount is " +tax);
		}
	}

	public static double incomeTaxCalculation(double salary) {
		// TODO Auto-generated method stub
		findIncomeTax obj = new findIncomeTax();
		double tax = obj.taxable_amount(salary);
		return tax;
	}

}
