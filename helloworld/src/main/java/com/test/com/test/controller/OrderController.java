package com.test.com.test.controller;

import com.test.server.OrderServerImpl;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class OrderController {

    @Resource
    private OrderServerImpl orderServerImpl;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String info = orderServerImpl.search("1");
        System.out.println(info);
        if (null==info){
            return "controller fail";
        }

        return "controller success";

    }


}
