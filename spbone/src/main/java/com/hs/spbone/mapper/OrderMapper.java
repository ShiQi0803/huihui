package com.hs.spbone.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface OrderMapper {
    public Map<String,Object> orderFindInfo(String id);
}
