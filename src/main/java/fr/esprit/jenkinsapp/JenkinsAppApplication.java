package fr.esprit.jenkinsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(JenkinsAppApplication.class, args);
        System.out.println("JenkinsAppApplication started michel is amazing");
    }

}
