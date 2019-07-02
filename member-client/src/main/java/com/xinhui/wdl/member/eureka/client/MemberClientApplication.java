package com.xinhui.wdl.member.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dongliang.wang
 * @createTime 2019/6/28
 **/
@SpringBootApplication
@EnableEurekaClient
public class MemberClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberClientApplication.class, args);
    }

}
