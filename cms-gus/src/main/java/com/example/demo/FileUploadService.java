package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService throws IllegalStateException,IOException {
	public void uploadFile(MultipartFile file) {
		file.transferTo(new File("C:\\Users\\gustx\\Desktop\\java\\cms-gus\\src\\main\\resources\\static" + file.getOriginalFilename()));
	}
}
