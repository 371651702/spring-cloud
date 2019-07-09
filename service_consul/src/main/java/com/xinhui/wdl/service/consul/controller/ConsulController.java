package com.xinhui.wdl.service.consul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/7/9
 **/
@RestController
public class ConsulController {

    @GetMapping("/consul")
    public String home(){
        return "hi,i'm consul";
    }
}
