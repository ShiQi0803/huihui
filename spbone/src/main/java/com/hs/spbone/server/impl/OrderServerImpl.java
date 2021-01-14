package com.hs.spbone.server.impl;

import com.hs.spbone.mapper.OrderMapper;
import com.hs.spbone.server.OrderServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServerImpl implements OrderServer {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public String findOrderInfo(String id) {
        if ("1".equals(id)){
            String info = orderMapper.orderFindInfo("1").toString();
            System.out.println(info);
            return info;
        }
        return "server fail";
    }
}
