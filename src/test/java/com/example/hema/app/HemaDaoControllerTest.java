package com.example.hema.app;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.hema.service.HemaDaoService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@WebMvcTest(value = HemaDaoController.class)
public class HemaDaoControllerTest {

	@Autowired
	MockMvc mvc;
	
	@MockBean
	HemaDaoService hds;
	
	@Test
	public void testController() throws Exception {
		Mockito.when(hds.callDaoService(anyInt(), anyString())).thenReturn("hema1") ;
		
		RequestBuilder reqBuild = MockMvcRequestBuilders.post("/hema/dao/?value=1&type=student")
				.accept(MediaType.APPLICATION_JSON_VALUE);
	    MvcResult result = mvc.perform(reqBuild).andReturn();
	    
	    String expected = "hema1";
	    Assert.assertEquals(expected, result.getResponse().getContentAsString());
	    
	    
	    
	}
}
