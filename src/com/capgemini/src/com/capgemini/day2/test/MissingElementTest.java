package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.MissingElementCheck;

class MissingElementTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(3,MissingElementCheck.checkForTheMissingElement(new int[] {1,2,4,5,6}));
	}

}
