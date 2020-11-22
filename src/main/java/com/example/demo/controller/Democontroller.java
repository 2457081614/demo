package com.example.demo.controller;

import com.example.demo.aop.DemoLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : yangliu@tiduyun.com
 */
@RestController
public class Democontroller {

    @GetMapping("/aop/test")
    @DemoLogger
    public void testAop() {
        System.out.println("hello world");
    }

}
