package com.rd.openshift.poc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rd.openshift.poc.api.NameServiceImpl;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackageClasses = { NameServiceImpl.class })
public class App {
	public static void main(String[] args) {

		SpringApplication.run(AppConfig.class, args);
	}
}
