package com.rd.openshift.poc.config;

import java.util.Arrays;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.rd.openshift.poc.api.NameService;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.rd.openshift.poc" })
public class AppConfig {

	@Autowired
	NameService nameService;

	@Bean()
	public SpringBus cxf() {
		return new SpringBus();
	}

	@Bean
	@DependsOn("cxf")
	public Server jaxRsServer() {
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
		factory.setServiceBeanObjects(nameService);
		factory.setProvider(new JacksonJsonProvider());
		factory.setProviders(Arrays.asList(new JacksonJsonProvider()));
		factory.setAddress("/");
		factory.setBus(cxf());

		return factory.create();
	}

}
