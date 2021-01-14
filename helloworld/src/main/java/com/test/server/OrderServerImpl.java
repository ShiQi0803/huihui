package com.test.server;

import com.test.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class OrderServerImpl implements OrderServer{

    @Resource
    private OrderMapper orderMapper;

    @Override
    public String search(String id) {
        if("1".equals(id)){
            Map info = orderMapper.search("1");
            System.out.println(info.toString());

            return "server success";
        }
        return "server fail";
    }
}
