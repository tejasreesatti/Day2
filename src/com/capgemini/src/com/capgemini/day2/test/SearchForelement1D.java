package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SearchForElement;
import com.capgemini.day2.SearchForElement1D;

class SearchForelement1D {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Element exists in the array", SearchForElement1D.ElementSearchInArray1D(new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}, 5));
		assertEquals("Element doesnot exist in the array", SearchForElement1D.ElementSearchInArray1D(new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}, 4));
	
	}

}
