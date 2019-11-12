package com.xinhui.wdl.server.zipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongliang.wang
 * @createTime 2019/7/8
 **/
@RestController
@Slf4j
public class ZipkinController {

    private RestTemplate restTemplate;

    public ZipkinController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/miya")
    public String callHome(){
        log.info("info is being called");
        return restTemplate.getForObject("http://localhost:8109/info",String.class);
    }

    @GetMapping("/in")
    public String info(){
        log.info("hi is being called");FactoryBean
        return "hi i'm miya!";
    }
}
