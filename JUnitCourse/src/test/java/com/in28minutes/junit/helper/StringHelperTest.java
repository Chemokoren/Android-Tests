package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	@Before
	public void setup(){
		helper =new StringHelper();
	}

	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions2_AinFirstPosition() {
		System.out.println(helper.truncateAInFirst2Positions("SACD"));
		assertEquals("SCD", helper.truncateAInFirst2Positions("SACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions2_NoAinPosition() {
		System.out.println(helper.truncateAInFirst2Positions("CDEF"));
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	@Test
	public void testTruncateAInFirst2Positions2_AinLast2Positions() {
		System.out.println(helper.truncateAInFirst2Positions("CDAA"));
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_inTwoCharacters() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_in1Character() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}

}
