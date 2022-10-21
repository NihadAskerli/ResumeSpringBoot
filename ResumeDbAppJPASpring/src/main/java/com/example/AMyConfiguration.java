package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

//@Component
@Configuration
@Scope("prototype")
@ComponentScan(basePackages = "outer")
public class AMyConfiguration {
    private String uid= UUID.randomUUID().toString();
    @Bean("alma")
//    @Scope("prototype")
    public Object getObject(){
        System.out.println("uid"+uid);
        System.out.println("salam obyekti yaratdim");
        return new Object();
    }
    public AMyConfiguration(){
        System.out.println("AMYConfiguration");
    }
}
