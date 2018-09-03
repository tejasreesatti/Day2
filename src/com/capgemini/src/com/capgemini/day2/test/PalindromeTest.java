package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Palindrome;

class PalindromeTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(1, Palindrome.findPalindrome(121));
		assertEquals(0, Palindrome.findPalindrome(123));
	}
}


