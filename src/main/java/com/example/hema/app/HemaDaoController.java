package com.example.hema.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hema.service.HemaDaoService;

@RestController
@RequestMapping (value="/hema/dao")
public class HemaDaoController {

	@Autowired
	HemaDaoService hemads;
	@RequestMapping(value="/", method = RequestMethod.POST)
	public ResponseEntity<List<String>> findValue (@RequestParam Integer value,@RequestParam String type) {
		
	//	String response = hemads.callDaoService(value,type);
		
	//	return ResponseEntity.status(HttpStatus.OK).body(response);
		
		return ResponseEntity.status(HttpStatus.OK).body(hemads.callDaoService(value,type));
	}
}
