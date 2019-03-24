package com.example.demospringscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSpringSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSchedulerApplication.class, args);
	}

}
