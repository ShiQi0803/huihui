package com.hs.testone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hs.testone.dao.*")
//(exclude = {DataSourceAutoConfiguration.class}) 启动排除数据源
public class TestoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestoneApplication.class, args);
    }

}
