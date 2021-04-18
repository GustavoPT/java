package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class SpringFileUploadController {
	
	@GetMapping("/index")
	public String hello() {
		return "uploader";
	}
	
	@PostMapping("/upload")
	public ResponseEntity<?> handleFileUpload
}
