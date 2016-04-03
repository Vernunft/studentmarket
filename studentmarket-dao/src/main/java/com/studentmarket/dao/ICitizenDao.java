package com.studentmarket.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.studentmarket.entity.Citizen;


@Repository
public interface ICitizenDao {

	public Citizen loginCheck(Citizen citizen);

	public int regist(Citizen citizen);

	public Citizen getCitizenByTel(String telephoneNumber);
	
	public List<Citizen> showIntegrate();
	
	@Select("select * from table_citizen where telephone_number=#{telephoneNumber} and password=#{password} ")
	public Citizen ifLofin(Citizen citizen);


}
