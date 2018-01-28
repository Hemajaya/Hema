package com.example.hema.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hema.dao.HemaDao;

@Service
public class HemaService {

	@Autowired
	HemaDao hdao;
	
	public List<List<String>> hemaServiceMethod (HashMap<String,String> hemaHash) {
		
		List<List<String>> hemaDoubleList = new ArrayList<List<String>>();
		List<String> hemaList = new ArrayList<>();
		
		for (Entry<String, String> hemaEntry : hemaHash.entrySet()) {
			
			hemaList.add(hemaEntry.getValue());
			hemaList.add(hemaEntry.getKey());
		}
		
		hemaDoubleList.add(hemaList);
		hemaList.clear();
		
		for (String hemaInt : hemaHash.keySet()) {
			hemaList.add(hemaHash.get(hemaInt));
			hemaList.add(hemaInt);
		}
		
		hemaDoubleList.add(hemaList);

		return hemaDoubleList;
		
	}
	
	
}
