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

    @GetMapping("/hi")
    public String callHome(){
        log.info("calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8110/miya",String.class);
    }

    @GetMapping("/info")
    public String info(){
        log.info("calling trace service-hi");
        return "i'm service-hi";
    }
}
