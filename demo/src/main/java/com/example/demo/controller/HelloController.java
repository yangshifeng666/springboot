package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: HelloController</p>
 * <p>Description: </p>
 *
 * @author ysf
 * @version 1.0
 * @date 2020/1/13
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}
