package com.greenfoxacademy.lionking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class LionkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LionkingApplication.class, args);
	}
	@RequestMapping(value = "/hello")
	@ResponseBody
	public static String hello() {
		return "Hello World!";
	}
}
