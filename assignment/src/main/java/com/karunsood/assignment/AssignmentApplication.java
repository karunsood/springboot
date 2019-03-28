package com.karunsood.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AssignmentApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AssignmentApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AssignmentApplication.class, args);
    }

}
