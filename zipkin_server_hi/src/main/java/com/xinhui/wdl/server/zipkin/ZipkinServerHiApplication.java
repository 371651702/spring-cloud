package com.xinhui.wdl.server.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dongliang.wang
 * @createTime 2019/7/8
 **/
@SpringBootApplication
public class ZipkinServerHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerHiApplication.class, args);
    }

}
