package com.capgemini.day2.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.changeDateFormat;

class DateTest {

	@Test
	void testdateFormatChange() {
		//fail("Not yet implemented");
		assertEquals("24/jul/1996", changeDateFormat.dateFormatChange("24,07,1996"));
	}

}
