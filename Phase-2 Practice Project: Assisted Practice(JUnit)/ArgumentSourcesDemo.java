package com.simplilearn.JUnitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArgumentSourcesDemo {
	
	@ParameterizedTest
	@CsvSource({"test, Test", "monDAy, MONday", "July,july"})
	public void test1(String actual, String expected) {
		String actualValue = actual.toLowerCase();
		String expectedValue = expected.toLowerCase();
		assertEquals(actualValue, expectedValue);
	}


}
