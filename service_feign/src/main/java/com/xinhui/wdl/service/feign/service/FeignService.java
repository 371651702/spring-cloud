package com.xinhui.wdl.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@FeignClient(value = "eureka-client",fallback = FeignServiceHystricImpl.class)
public interface FeignService {

    /**
     * Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign
     * 本实例是feign方式实现的
     * 调用远程eureka-client服务上hi方法
     *
     * GetMapping("/hi")调用eureka_client客户端的GetMapping("/hi")
     *
     * @param name 调用时传递的参数
     * @return 远程服务的端口
     */
    @GetMapping("/hi")
    String getServeName(@RequestParam("name") String name);
}
