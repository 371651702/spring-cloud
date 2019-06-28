package com.xinhui.wdl.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/6/28
 **/
@RestController
public class TestController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    public String getHello() {
        return hello;
    }
}
