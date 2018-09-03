package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.findIncomeTax;

class IncomeTaxTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(47600, findIncomeTax.incomeTaxCalculation(350000));
	}

}
