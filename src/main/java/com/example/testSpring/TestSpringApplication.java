package com.example.testSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
включает:
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
	сканрирует:
	@Component
	@Scan
	@Controller
 */
public class TestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
	}

}
