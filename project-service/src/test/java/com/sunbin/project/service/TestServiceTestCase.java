package com.sunbin.project.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import com.sunbin.project.common.StringUtil;

public class TestServiceTestCase extends SpringJunitTestCase {

	@Resource
	private TestService testService;

	@Test
	public void test() {
		Assert.assertFalse(StringUtil.isEmptyString(testService.getTestPojo().getName()));
	}

}
