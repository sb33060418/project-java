package com.sunbin.project.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunbin.project.mapper.TestMapper;
import com.sunbin.project.pojo.TestPojo;
import com.sunbin.project.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Resource
	private TestMapper testMapper;
	
	@Override
	public TestPojo getTestPojo() {
		// TODO Auto-generated method stub
		return testMapper.getTestPojo();
	}

}
