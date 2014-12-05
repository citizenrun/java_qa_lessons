package com.it.source.collections.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.it.source.collections.Box;

public class BoxTestBefore {
	Box<String> box;
	
	@Before 
	public void init() {
		box = new Box<String>();
	}
	
	@Test
	public void testBoxMain() {
		box.add("Henley");
		
		assertTrue(box.size() == 1);
		assertTrue("Henley".equals(box.get()));
	}

	@Test(expected = Exception.class)
	public void testBoxIsNull(){
		box.add("Rudy Gestede");
	}
}
