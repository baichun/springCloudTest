package com.uxun.bc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 欧阳爱东 on 2018/2/9.
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class);
    }
}
