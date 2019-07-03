package com.xinhui.wdl.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@FeignClient("eureka-client")
public interface FeignService {

    /**
     * 调用远程eureka-client服务上hi方法
     * @param name 调用时传递的参数
     * @return 远程服务的端口
     */
    @GetMapping("/hi")
    String getServeName(@RequestParam("name") String name);
}
