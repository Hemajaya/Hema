package com.example.hema.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hema.service.HemaService;

@RestController
@RequestMapping(value = "/hema/work")

public class HemaWorkController {

	@Autowired
	HemaService hs;

	@RequestMapping(value = "/func", method = RequestMethod.POST)

	public ResponseEntity<List<List<String>>> HemaFunction(@RequestBody HashMap<String, String> hemaMap) {

		List<List<String>> hemaDoubleListF = new ArrayList<List<String>>();

		hemaDoubleListF = hs.hemaServiceMethod(hemaMap);

		// List<String> hemaList = new ArrayList<>();

		/*
		 * for (Entry<Integer, String> hemaEntry : hemaMap.entrySet()) {
		 * System.out.println("Key is : " + hemaEntry.getKey() + "Value is : " +
		 * hemaEntry.getValue()); hemaList.add(hemaEntry.getValue()); }
		 * 
		 * for (Integer hemaInteger : hemaMap.keySet()) {
		 * hemaList.add(hemaMap.get(hemaInteger)); }
		 * 
		 * hemaDoubleList.add(hemaList);
		 */
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(hemaDoubleListF);

		//return hemaDoubleListF;

	}

}
