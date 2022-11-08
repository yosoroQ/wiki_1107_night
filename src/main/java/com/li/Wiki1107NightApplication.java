package com.li;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.li.mapper")
public class Wiki1107NightApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wiki1107NightApplication.class, args);
    }

}
