package com.hs.testone.controller;

import com.hs.testone.service.order.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/order/")
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/getOrder/{id}")
    @ResponseBody
    public String getOrder(@PathVariable String id) {
        Map m = this.orderService.findOrderById(id);
        System.out.println("11111");
        return String.valueOf(m);
    }

}
