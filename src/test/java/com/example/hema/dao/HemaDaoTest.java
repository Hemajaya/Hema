package com.example.hema.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
public class HemaDaoTest {

	@TestConfiguration
	static class HemaConfig {
		@Bean
		public HemaDao hdao1() {
			return new HemaDao();
		}
	}

	@Autowired
	HemaDao hdao;
	
	@Test
	public void daoTest () {
		
		String result = hdao.queryStudent(1);
		Assert.assertEquals("hema1", result);
		

	}
	
	@Test
	public void daoTest2 () {
		org.junit.Assert.assertEquals("jay", hdao.queryTeacher(1));
				
	}
}
