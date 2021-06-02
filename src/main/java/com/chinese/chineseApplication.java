package com.chinese;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@MapperScan("com.chinese.dao")
public class chineseApplication {
    public static void main(String[] args){
        SpringApplication.run(chineseApplication.class, args);
    }

}
