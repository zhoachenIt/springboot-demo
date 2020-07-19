package com.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 11752
 * @version 1.0
 * @date 2020/7/19 10:56
 */
@RestController
public class DemoRestController {

    @RequestMapping("/rest")
    public String test() {
        return "访问成功";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "访问成功test2";
    }

}