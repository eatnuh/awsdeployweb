package com.eatnuh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AwsDeployWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsDeployWebApplication.class, args);
    }

    @RestController
    static class HelloController {
        @RequestMapping
        public String hello() {
            return "hello my web webhook test~~~!! build deploy!!!!!";
        }

    }
}
