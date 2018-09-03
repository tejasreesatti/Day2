package com.capgemini.day2;

public class ReverseString {

	public static String StringReverseTest(String string) {
		// TODO Auto-generated method stub
		String arrSplit[] = string.split(" ");
	    String fo="";
	    for (int i = 0; i < arrSplit.length; i++)
	    {
	    	String reverse = "";
	    	for(int j = arrSplit[i].length()-1; j >= 0;j--) {
	    		reverse += arrSplit[i].charAt(j);
	    	}
	    	fo = fo + reverse +" ";
	    } 
	 
	return fo;
		//return null;
	}

}
