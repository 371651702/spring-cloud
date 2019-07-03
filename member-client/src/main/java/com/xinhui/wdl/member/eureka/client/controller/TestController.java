package com.xinhui.wdl.member.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
