package com.xinhui.wdl.config.client.controller;

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
    String hello;

    @GetMapping("/hello")
    public String getHello() {
        return hello;
    }

    public static void main(String[] args) {
        printMod();
        getStringLength();
        printArrayMaxIndex();
    }

    private static void printArrayMaxIndex() {
        int[] arr = {2,5,9,7};
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    maxIndex = i;
                } else {
                    maxIndex = j;
                }
            }
        }
        System.out.println(maxIndex);
    }

    private static void getStringLength() {
        //空格也算长度 11
        String str = "i am hello!";
        System.out.println(str.length());
    }

    private static void printMod() {
        //2
        int a = 2 % 5;
        //整除为0
        int a1 = 20 % 2;
        //整除为0
        int a2 = 2 % 2;
        //除不尽余数为1
        int a3 = 7 % 2;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
