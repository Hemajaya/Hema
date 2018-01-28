package com.example.hema.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HemaDao {

	@Autowired
	private DataSource ds;
	
	public List<String> queryStudent(Integer id) {
	
		return returnName(id);
	
	}
	
	public String queryTeacher(Integer id) {
		
		return staticdatateacher().get(id);
		
		///

	//////
		// new changes 
		// nandhi changes

		
	}


	public List<String> returnName(Integer id) {
	//	NamedParameterJdbcTemplate jdbc = new NamedParameterJdbcTemplate(ds);
		JdbcTemplate jdbc = new JdbcTemplate(ds);
		String sqlState = "SELECT NAME FROM STUDENT_TBL WHERE ID=" + id ;
	//	final List<String> name = new ArrayList<>();
		List<String> name  =jdbc.query(sqlState, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				return (rs.getString("NAME"));
				//return name;
			}
		});
		return name;
		
	}
	private Map<Integer, String> staticdata() {

		Map<Integer, String> student = new HashMap<>();
		student.put(1, "hema1");
		student.put(2, "hema2");
		student.put(3, "hema3");
		student.put(4, "hema4");
		
		return student;
	}
	
	
	private Map<Integer, String> staticdatateacher() {

		Map<Integer, String> teacher = new HashMap<>();
		teacher.put(1, "jay");
		teacher.put(2, "hema2");
		teacher.put(3, "hema3");
		teacher.put(4, "hema4");
		
		return teacher;
	}

}
