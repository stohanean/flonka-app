package com.ibm.de.ish;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FlonkaTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlonkaTestAppApplication.class, args);
	}

	@Value("${flonka_url:flonka default url}")
	private String flonka_url;

	@Value("${flonka_message}")
	private String message;

	@RequestMapping("/")
	public String getDefault() {
		return "Hello World-> (try out: /flonka, /florinel, /ISH)";

	}

	@GetMapping("/flonka")
	public String getFlonka() {
		return "Hello Flonka: " + flonka_url;
	}

	@GetMapping("/florinel")
	public String getFlrinel() {
		return "Hello Florinel Randasu: "+message;
	}

	@RequestMapping("/ish")
	public String getISH() {
		return "Hello ISH!";
	}

}
