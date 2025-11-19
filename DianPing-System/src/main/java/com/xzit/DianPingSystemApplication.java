package com.xzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.xzit.mapper")
@SpringBootApplication
public class DianPingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianPingSystemApplication.class, args);
    }

}
