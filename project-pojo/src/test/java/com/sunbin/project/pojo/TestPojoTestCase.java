package com.sunbin.project.pojo;

import org.junit.Assert;
import org.junit.Test;

public class TestPojoTestCase {

	@Test
	public void test() {
		TestPojo pojo = new TestPojo();
		pojo.setId(1);
		pojo.setName("a");
		Assert.assertEquals("a", pojo.getName());
	}

}
