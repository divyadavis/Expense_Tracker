package com.example.etracker.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository
public class Etracker_DaoImpl implements Etracker_Dao {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	

}
