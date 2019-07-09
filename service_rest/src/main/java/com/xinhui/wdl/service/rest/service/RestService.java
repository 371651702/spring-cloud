package com.xinhui.wdl.service.rest.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongliang.wang
 * @createTime 2019/7/3
 **/
@Service
public class RestService {

    private RestTemplate restTemplate;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign
     * 本案例是ribbon+restTemplate方式实现
     * @param name  调用时传递过来的名字
     * @return 远程调用接受的信息
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String getServiceName(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name,String.class);
    }

    /**
     * 熔断时调用的方法
     * @param name  调用时传递过来的名字
     * @return  熔断时显示的内容
     */
    public String hiError(String name){
        return "hi," + name + ",sorry,error!";
    }
}
