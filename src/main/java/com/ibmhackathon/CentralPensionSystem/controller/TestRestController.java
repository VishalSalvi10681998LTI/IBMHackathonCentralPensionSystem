package com.ibmhackathon.CentralPensionSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/testrestcontroller")
public class TestRestController {
	
	@GetMapping("/getAllProjects")
	public List<String> getAllProjects(){
		List<String> testList=new ArrayList<>();
		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		return testList;
	}

}
