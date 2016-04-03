package com.studentmarket.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentmarket.dao.ICitizenDao;
import com.studentmarket.entity.Citizen;
import com.studentmarket.service.TestService;

@Controller
public class TestController {
	
	@Resource
	private TestService testService; 
	
	@RequestMapping("test.do")
	public String test(String username,String password){
//		System.out.println(username);
//		System.out.println(password);
//		Citizen citizen = new Citizen();
//		citizen.setTelephoneNumber(username);
//		citizen.setPassword(password);
//		Citizen test = testService.test(citizen);
//		if(test==null)return "failure";
//		else return "success";
		System.out.println("ee00");
		testService.test(new Citizen());
		return "success";

	}
	@RequestMapping(value="test2")
	public String test2(){
		System.out.println("ee00");
		testService.test(new Citizen());
		return "success";
	}
}
