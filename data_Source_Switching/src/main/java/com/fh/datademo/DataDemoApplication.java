package com.fh.datademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DataDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDemoApplication.class, args);
	}
}
