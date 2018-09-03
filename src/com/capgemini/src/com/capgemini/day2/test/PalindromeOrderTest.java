package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.PalindromeCheck;

class PalindromeOrderTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertArrayEquals(new String[]{"121","343",null,null,null,null,null,null,null,null}, PalindromeCheck.OrderPalindromes(new String[] {"121","153","343","234","256","274","567","341","876","342"}));
				
	}

}
