package com.example.hikingApp;

import com.example.hikingApp.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class HikingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikingAppApplication.class, args);
	}

}
