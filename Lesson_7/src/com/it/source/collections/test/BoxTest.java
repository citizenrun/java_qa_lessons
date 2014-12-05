package com.it.source.collections.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.it.source.collections.Box;

public class BoxTest {
	
	@Test
	public void testBoxMain() {
		Box<String> box = new Box<String>();
		
		box.add("Henley");
		
		assertTrue(box.size() == 1);
		assertTrue("Henley".equals(box.get()));
		
		assertFalse("Rudy Gestede".equals("Henley"));
	}
	
	@Test
	@Ignore
	public void testBoxMainWrong() {
		Box<String> box = new Box<String>();
		
		box.add("Henley");
		assertTrue("Henley".equals(box.get()));
		assertTrue(box.size() == 1);
		
		
	}

}
