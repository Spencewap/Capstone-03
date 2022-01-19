package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTesting {

	@Before public void createDAOObject() {
		
		
	}
	
	@After public void deleteDAOObject() {
		
	}
	
	@Test public void testExample() {
		String example = "This is an example";
		assertEquals("This is an example", example);
	}
	
}
