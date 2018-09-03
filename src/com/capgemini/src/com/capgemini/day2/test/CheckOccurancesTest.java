package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.NumberOfOccurances;

class CheckOccurancesTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(2,NumberOfOccurances.findNumberOfOccurances(new String[] {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson","Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"}, "Sam"));
	}

}
