package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SearchForElement;

class SearchArrayElement2d {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Element exists in the Array", SearchForElement.ElementSearchInArray(new int[][]{{1,2,3},{4,5,6}}, 4));
		assertEquals("Element does not exists in the Array", SearchForElement.ElementSearchInArray(new int[][]{{1,2,3},{4,5,6}}, 9));
	
	}

}
