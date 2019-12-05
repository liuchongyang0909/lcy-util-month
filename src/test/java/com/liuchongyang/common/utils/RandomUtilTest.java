package com.liuchongyang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 10);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] sr = RandomUtil.subRandom(1, 10, 3);
		for (int i : sr) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char x = RandomUtil.randomCharacter();
		System.out.println(x);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(10);
		
		System.out.println(randomString);
	}

}
