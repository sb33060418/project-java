package com.sunbin.project.mapper;

import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;

import com.sunbin.project.common.StringUtil;

public class TestMapperTestCase extends SpringJunitTestCase {

	@Resource
	private TestMapper testMapper;

	@Test
	public void test() {
		Assert.assertFalse(StringUtil.isEmptyString(testMapper.getTestPojo().getName()));
	}

}
