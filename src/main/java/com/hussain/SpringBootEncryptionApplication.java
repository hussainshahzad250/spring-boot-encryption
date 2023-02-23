package com.hussain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootEncryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEncryptionApplication.class, args);
		log.info("Service is up and running...");
	}
}
