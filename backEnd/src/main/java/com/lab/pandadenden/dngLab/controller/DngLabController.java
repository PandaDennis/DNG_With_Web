package com.lab.pandadenden.dngLab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.pandadenden.dngLab.service.DngService;

@RestController
public class DngLabController {
	
	@Autowired
	private DngService dngService;

	// for Testing API
	@GetMapping("/")
	String getProjectTitle() {
		return "Welcome To DNG LAB (By PandaDenDen|| dnglab.)";
	}
	
	@GetMapping("/info")
	String getSystemInfo() {
		return dngService.showFileInfo();
	}
	

}
