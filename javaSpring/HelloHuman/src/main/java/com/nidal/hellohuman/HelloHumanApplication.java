package com.nidal.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RestController
	public class HomeController {
	    @RequestMapping("/")
	    public String index(@RequestParam(value="name",defaultValue="Human") String name) {
	        return "<h1>Hello " + name +"</h1><p>welcome to spring boot</p>" ;
	    }
	}
}
