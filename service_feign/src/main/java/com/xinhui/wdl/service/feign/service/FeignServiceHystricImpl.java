package com.xinhui.wdl.service.feign.service;

import org.springframework.stereotype.Component;

/**
 * 服务熔断实现类
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@Component
public class FeignServiceHystricImpl implements FeignService{
    @Override
    public String getServeName(String name) {
        return "sorry: " + name;
    }
}
