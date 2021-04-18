package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.StorageService;

@Configuration 
public class SpringConfig { 

	@Bean
	public StorageService storageService() {
	    return new StorageService();
	}

}