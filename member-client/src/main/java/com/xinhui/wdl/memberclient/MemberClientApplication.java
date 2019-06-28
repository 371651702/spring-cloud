package com.xinhui.wdl.memberclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MemberClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberClientApplication.class, args);
    }

}
