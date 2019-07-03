package com.xinhui.wdl.service.feign.controller;

import com.xinhui.wdl.service.feign.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@RestController
public class FeignServeController {

    private FeignService feignService;

    public FeignServeController(FeignService feignService) {
        this.feignService = feignService;
    }

    @GetMapping("/feign")
    public String getRemoteServeMessage(@RequestParam String name){
        return feignService.getServeName(name);
    }
}
