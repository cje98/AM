package com.kh.am.calendar.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CalendarDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
}