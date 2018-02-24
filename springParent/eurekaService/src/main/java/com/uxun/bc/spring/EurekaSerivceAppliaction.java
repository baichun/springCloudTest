package com.uxun.bc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 欧阳爱东 on 2018/2/9.
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaSerivceAppliaction {

    public static void main(String[] args){
        SpringApplication.run(EurekaSerivceAppliaction.class);
    }
}
