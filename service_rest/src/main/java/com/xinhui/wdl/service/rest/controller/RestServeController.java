package com.xinhui.wdl.service.rest.controller;

import com.xinhui.wdl.service.rest.service.RestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@RestController
public class RestServeController {

    private RestService restService;

    public RestServeController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("/rest")
    public String getRemoteServeMessage(@RequestParam String name){
        System.out.println("zull调用");
        return restService.getServiceName(name);
    }
}
