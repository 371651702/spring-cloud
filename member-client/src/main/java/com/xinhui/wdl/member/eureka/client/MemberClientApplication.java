package com.xinhui.wdl.member.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
