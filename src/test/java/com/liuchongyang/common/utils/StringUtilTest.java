package com.liuchongyang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean h1 = StringUtil.hasLength(null);
		System.out.println(h1);
		boolean h2 = StringUtil.hasLength(" ");
		System.out.println(h2);
		boolean h3 = StringUtil.hasLength("");
		System.out.println(h3);
	}

	@Test
	public void testHasText() {
		boolean h1 = StringUtil.hasText(null);
		System.out.println(h1);
		boolean h2 = StringUtil.hasText(" ");
		System.out.println(h2);
		boolean h3 = StringUtil.hasText("");
		System.out.println(h3);
	}

	@Test
	public void testRandomChineseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}

}
