package com.lab.pandadenden.dngLab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dngLabController {

	@GetMapping("/")
	String all() {
		return "Welcome To DNG LAB (By PandaDenDen|| dnglab.)";
	}

}
