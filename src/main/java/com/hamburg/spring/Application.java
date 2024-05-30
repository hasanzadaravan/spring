package com.hamburg.spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		// 1 bean nedir?
		// anotasiya( @Service,@Component ,@configuration,@repository,@restcontroller,@requestmapping

		SpringApplication.run(Application.class, args);


	}

}
