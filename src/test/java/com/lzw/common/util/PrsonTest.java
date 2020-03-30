package com.lzw.common.util;

import java.util.Date;

import org.junit.Test;

public class PrsonTest {
	/**
	 * 
	 * @Title: test 
	 * @Description: 随机生成10000个person对象
	 * @return: void
	 */
	@Test
	public void test() {
		//循环10000次
		for(int i=0;i<10000;i++){
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1,120));
			person.setAbout(StringUtil.randomChineseString(140));
			person.setCreated(DataUtil.randomDate("2010-1-1","2020-3-30"));
			System.out.println(person);
			System.out.println(i);
		}
	}
}
