package com.liuchongyang.common.utils;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void isNumber() {
		boolean b = StringUtil.isNumber("-0.123");
		System.out.println(b);
	}

	@Test
	public void getAge() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 11, 07);
		int age = StringUtil.getAge(c.getTime());
		System.out.println(age);
	}

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
	}

	@Test
	public void testGenerateChineseName() {
	}

}
