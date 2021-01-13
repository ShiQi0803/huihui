package com.hs.testone.test;

import com.hs.testone.service.order.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TestController {

    @Resource
    private OrderService orderService;

    @GetMapping("/hello")
    public String test() {
        return "CMJ say Yes";
    }

    @GetMapping("/getOrder/{id}")
    public String getOrder(@PathVariable String id) {
        Map m = this.orderService.findOrderById(id);
        System.out.println("2222222");
        return String.valueOf(m);
    }

}
