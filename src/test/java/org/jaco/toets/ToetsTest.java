package org.jaco.toets;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToetsTest {

	@Test
	public void test01() {
		assertEquals(3, Toets.myadd(0, 0));
	}

	@Test
	public void test02() {
		assertEquals(3, Toets.myadd(1, 0));
	}
	
	@Test
	public void test03() {
		assertEquals(3, Toets.myadd(0, 1));
	}
	
}
