package com.capgemini.day2.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.findSimpleCompoundIntrest;

class CompoundIntrestTest {

	@Test
	void testcompoundIntrest() {
		//fail("Not yet implemented");
		assertArrayEquals(new double[] {10400,10404}, findSimpleCompoundIntrest.simpleCompoundIntrest(10000,2,2));
	}

}
