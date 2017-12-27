package com.sunbin.project.web.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunbin.project.common.StringUtil;

public class testControllerTestCase extends SpringJunitTestCase {

	@Autowired
	private TestController testController;

	@Test
	public void test() {
		Assert.assertFalse(StringUtil.isEmptyString(testController.testJson()));
	}

}
