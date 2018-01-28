package com.example.hema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hema.dao.HemaDao;

@Service
public class HemaDaoService {
@Autowired
HemaDao hd;

public List<String> callDaoService (Integer value, String type) {
	
	if (type.equalsIgnoreCase("student") ) {
		return hd.queryStudent(value);
		
//	} else if (type.equalsIgnoreCase("teacher")) {
//		return hd.queryTeacher(value);
	} 
	
	return null;
}


}
