package com.xinhui.wdl.service.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsulApplication.class, args);
    }

}
