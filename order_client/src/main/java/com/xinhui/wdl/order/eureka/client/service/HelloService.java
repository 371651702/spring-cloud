package com.xinhui.wdl.order.eureka.client.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@Service
public class HelloService {

    private final RestTemplate restTemplate;
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hiService(String name){
        return restTemplate.getForObject("http://eureka-member/hi?name=" + name,String.class);
    }
}
