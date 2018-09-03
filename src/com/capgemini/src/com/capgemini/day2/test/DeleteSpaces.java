package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SpacesDeletion;

class DeleteSpaces {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("The book is the table",SpacesDeletion.deleteExcessSpaces("The book is    on the table", "on", 4));
	}

}
