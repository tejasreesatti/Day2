package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.BubbleSort;

class BubbleSortTest {

	@Test
	void testbubbleSort() {
		//fail("Not yet implemented");
		assertArrayEquals(new int[]{1,2,3,4,5},BubbleSort.bubbleSort(new int[] {5,3,2,1,4}));
		assertArrayEquals(new int[]{97,98,99,100,101},BubbleSort.bubbleSort(new int[] {'d','e','a','b','c'}));
		assertArrayEquals(new int[]{97,97,98,100,101},BubbleSort.bubbleSort(new int[] {'d','e','a','b','a'}));

	}
}
