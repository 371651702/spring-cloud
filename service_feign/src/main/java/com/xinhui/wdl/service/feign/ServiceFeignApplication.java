package com.xinhui.wdl.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现；
 * EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
 * @author dongliang.wang
 * @createTime 2019/6/28
 **/

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

}
