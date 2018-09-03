package com.capgemini.day2;

public class findSimpleCompoundIntrest {
	
	public static double[] simpleCompoundIntrest(double priciple, double rate, int time) {
		double compoundIntrest = priciple * Math.pow((1+rate*0.01),time);
		double SI  = priciple + (priciple * time * rate )/100;
		double simpleCompoundIntrest[] = {SI, compoundIntrest};
		return simpleCompoundIntrest;
		// TODO Auto-generated method stub
	
	}

}
