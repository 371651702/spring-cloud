package com.xinhui.wdl.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/7/4
 **/
@RestController
@RefreshScope
public class RemoteObtainController {

    @Value("${hello}")
    private String hello;

    @GetMapping("hello")
    public String getRemoteData(){
        return hello;
    }

}
