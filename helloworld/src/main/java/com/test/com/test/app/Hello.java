package com.test.com.test.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "SHIQI world";
    }
}
