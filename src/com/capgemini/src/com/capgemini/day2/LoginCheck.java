package com.capgemini.day2;

public class LoginCheck {

	public static String checkLoginDetails(String userId, String Password) {
		// TODO Auto-generated method stub
		String name = "Tejasree.satti" , passwd = "1234abc";
		String Valid = "";
		String NotValid = "";
		if(userId.equals(name) && Password.equals(passwd)) {
			Valid = "Welcome";
			return Valid;
		}
	
	
	NotValid = "Invalid Credentials, Contact the Admin";
	return NotValid;
	}

}
