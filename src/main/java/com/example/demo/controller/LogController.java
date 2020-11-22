package com.example.demo.controller;

import com.example.demo.aop.DemoLogger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : yangliu@tiduyun.com
 */
@RestController
@Slf4j
public class LogController {

    @GetMapping("/log/test1")
    public void test1() {
        MDC.put("bizType","biz1");
        log.info("biz1 hello world");
        System.out.println("hello world");
    }

    @GetMapping("/log/test2")
    public void test2() {
        MDC.put("bizType","biz2");
        log.info("biz1 hello world");
        System.out.println("hello world");
    }
}
