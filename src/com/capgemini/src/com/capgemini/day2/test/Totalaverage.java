package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.AverageMarks;

class Totalaverage {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertArrayEquals(new int[][] {{94, 283},
			  {87, 263},
			  {81, 243}},
						AverageMarks.subAverageAndTotal(new int[][] {{100, 90, 80},
										  {95, 85, 75},
										  {88, 88, 88}}));
		assertArrayEquals(new int[][] {{90, 270},
			 {85, 255},
			 {88, 264}},
						AverageMarks.studentAverageAndTotal(new int[][] {{100, 90, 80},
										 {95, 85, 75},
										 {88, 88, 88}}));
	}

}
