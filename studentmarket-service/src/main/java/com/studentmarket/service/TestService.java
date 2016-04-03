package com.studentmarket.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.studentmarket.dao.ICitizenDao;
import com.studentmarket.entity.Citizen;

@Service
public class TestService {

	@Resource
	private ICitizenDao citizenDao;
	
	public Citizen test(Citizen citizen){
		return citizenDao.ifLofin(citizen);
	}
}
