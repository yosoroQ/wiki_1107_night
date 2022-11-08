package com.li.controller;

import com.li.entity.Test;
import com.li.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

//    @Value("${test.hello:TEST}")
//    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world100";
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}
