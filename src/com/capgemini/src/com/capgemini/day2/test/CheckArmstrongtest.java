package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongTest;

class CheckArmstrongtest {

	@Test
	void checkArmstrong() {
		assertEquals(true, ArmstrongTest.checkArmstrong(153));
		assertEquals(false,ArmstrongTest.checkArmstrong(145));
		assertEquals(true,ArmstrongTest.checkArmstrong(-153));
		assertEquals(false,ArmstrongTest.checkArmstrong(0456));
		assertEquals(false,ArmstrongTest.checkArmstrong(0x153));
		assertEquals(false,ArmstrongTest.checkArmstrong('a'));
	}

	
}
