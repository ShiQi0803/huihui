package com.hs.testone.service.impl.order;

import com.hs.testone.dao.order.OrderMapper;
import com.hs.testone.service.order.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Map findOrderById(String id) {
        return orderMapper.findOrderById(id);
    }

}
