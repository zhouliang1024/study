package com.yuye.improve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.yuye.improve.mapper")
public class ImproveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImproveApplication.class, args);
    }

}
