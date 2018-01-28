package com.example.hema.service;

import static org.mockito.Matchers.anyInt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.hema.app.HemaApplication;
import com.example.hema.dao.HemaDao;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
//@SpringBootTest(
//		  webEnvironment = WebEnvironment.RANDOM_PORT,
//		  classes = HemaApplication.class)
public class HemaDaoServiceTest {
	
	
	  @TestConfiguration
	    static class EmployeeServiceImplTestContextConfiguration {
	  
	        @Bean
	        public HemaDaoService hds() {
	            return new HemaDaoService();
	        }
	    }
	 
	
	@Autowired
	HemaDaoService hds;
	
	@MockBean
	HemaDao dao;
	
	@Test
	public void testService() {
	
		Mockito.when(dao.queryStudent(anyInt())).thenReturn("hema1");
		Mockito.when(dao.queryTeacher(anyInt())).thenReturn("jay");
		
		String result = hds.callDaoService(1, "student");
		Assert.assertEquals("hema1", result);
	}

}
