package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.LoginCheck;

class LoginTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Welcome", LoginCheck.checkLoginDetails("Tejasree.satti", "1234abc"));
		assertEquals("Invalid Credentials, Contact the Admin", LoginCheck.checkLoginDetails("Tejasres.satti", "1234abc"));
		
	}

}
