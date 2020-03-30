package com.lzw.common.util;
import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String string=null;
		boolean length = StringUtil.hasLength(string);
		System.out.println(length);
	}

	@Test
	public void testHasText() {
		String string=" ";
		boolean length = StringUtil.hasText(string);
		System.out.println(length);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(3);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
