package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.DuplicateCheck;
import com.capgemini.day2.LoginCheck;

class DuplicateTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("abc", DuplicateCheck.checkDuplicates("abcabcabc"));
		
	}

}
