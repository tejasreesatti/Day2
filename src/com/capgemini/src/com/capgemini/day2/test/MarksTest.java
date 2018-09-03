package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SubjectMarks;

class MarksTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals("Passed",SubjectMarks.evaluationOfMarks (67,67,67));
		assertEquals("Failed",SubjectMarks.evaluationOfMarks (35,54,67));
		assertEquals("Promoted",SubjectMarks.evaluationOfMarks (50,87,90));
	}

}
