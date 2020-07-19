package com.boot.demo.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: DemoController <br>
 * date: 2020/6/2 14:45 <br>
 * author: 11752 <br>
 * version: 1.0 <br>
 */
@Controller
public class DemoController {

    @RequestMapping("/login.html")
    public String login() {
        return "login.html";
    }

    @RequestMapping("/index.html")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/")
    public String index2() {
        return "index.html";
    }


}
