package com.eoghanhynes.githubcicdaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCicdActionApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to GitHub Cicd-Action";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionApplication.class, args);
    }

}
