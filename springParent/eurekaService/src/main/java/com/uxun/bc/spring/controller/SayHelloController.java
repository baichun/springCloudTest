package com.uxun.bc.spring.controller;

import com.uxun.bc.spring.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * Created by 欧阳爱东 on 2018/2/9.
 */
@RestController
@RequestMapping("/say")
public class SayHelloController {

    @RequestMapping("/hello")
    public String sayHello() throws Exception{
        Random random = new Random();
        Integer num = random.nextInt(10);
        System.out.println("======num========="+num);
        if(num > 6){
            throw  new Exception("======failback=======");
        }else{

            return "hello world!!";
        }
    }

    @RequestMapping("/helloTo")
    public String sayHelloTo(@RequestParam String name){

        return "hello dear "+name;
    }

    @RequestMapping(value = "/helloToUser",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public  User sayHelloToUser(@RequestBody User user){
        if("f".equalsIgnoreCase(user.getSex())){
            user.setDesc("she is a nice girl !!");
        }else{
            user.setDesc("he is a handsome boy !!");
        }
        return user;
    }
}
