package com.hs.spbone.controller;

import com.hs.spbone.server.impl.OrderServerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderServerImpl orderServerImpl;

    @RequestMapping("/order")
    public String findOrderInfo(String id){

        String info = orderServerImpl.findOrderInfo("1");

        return info;
    }
}
