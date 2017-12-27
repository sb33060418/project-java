package com.sunbin.project.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.sunbin.project.pojo.TestPojo;
import com.sunbin.project.service.TestService;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/html")
	public String testHtml(HttpServletRequest request) {
		TestPojo pojo = testService.getTestPojo();
		System.out.println("test/html:" + pojo);
		request.setAttribute("pojo", pojo);
		return "test/html";
	}

	@RequestMapping(value = "/json")
	@ResponseBody
	public String testJson() {
		TestPojo pojo = testService.getTestPojo();
		System.out.println("test/json:" + JSON.toJSONString(pojo));
		return JSON.toJSONString(pojo);
	}

}
