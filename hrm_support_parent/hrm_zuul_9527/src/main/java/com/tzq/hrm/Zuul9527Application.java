package com.tzq.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient//表示注册到eureka
@EnableZuulProxy//表示是zuul

public class Zuul9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527Application.class,args);
    }
}
