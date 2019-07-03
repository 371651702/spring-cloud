package com.xinhui.wdl.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现；
 * EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
 * @author dongliang.wang
 * @createTime 2019/6/28
 **/
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
