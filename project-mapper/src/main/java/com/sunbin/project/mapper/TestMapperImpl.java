package com.sunbin.project.mapper;

import org.springframework.stereotype.Repository;

import com.sunbin.project.pojo.TestPojo;

@Repository
public class TestMapperImpl implements TestMapper {

	@Override
	public TestPojo getTestPojo() {
		// TODO Auto-generated method stub
		TestPojo pojo = new TestPojo();
		pojo.setId(1);
		pojo.setName("a");
		return pojo;
	}

}
