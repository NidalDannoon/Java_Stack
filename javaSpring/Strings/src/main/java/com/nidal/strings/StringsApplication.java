package com.nidal.strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class StringsApplication {
        public static void main(String[] args) {
                SpringApplication.run(StringsApplication.class, args);
        }
        @RequestMapping("/")
        public String hello() { 
        	
                return "<h1>Hello Client, How are you doing?</h1>";
        }
        @RequestMapping("/random")
        public String random() { 
        	
                return "<h1>Spring Boot is great. So easy to just respond with strings.</h1>";
        }
}