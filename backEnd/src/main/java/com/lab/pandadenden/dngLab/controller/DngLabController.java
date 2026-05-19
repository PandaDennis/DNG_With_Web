package com.lab.pandadenden.dngLab.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lab.pandadenden.dngLab.service.DngService;

@RestController
@RequestMapping("/api")
public class DngLabController {
	
	@Autowired
	private DngService dngService;

	// for Testing API
	@GetMapping("/")
	String getProjectTitle() {
		return "Welcome To DNG LAB (By PandaDenDen|| dnglab.)";
	}
	
	@PostMapping("/checkFileInfo")
	String getSystemInfo(@RequestParam("file") MultipartFile[] files) throws IOException {
		for(MultipartFile file :  files) {
			dngService.checkFileInfo(file.getInputStream(),file.getOriginalFilename());
		}
		
		return "Testing file check";
	}
	

}
