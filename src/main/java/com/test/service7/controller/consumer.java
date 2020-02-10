package com.test.service7.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lei
 * @Date 2020/2/9 19:49
 * @Version 1.0
 */

@RestController
@RequestMapping("/service7")
public class consumer {

    @Value("${eureka.instance.metadata-map.version}")
    private String version;

    @GetMapping("/getServiceInfo")
    public String getVersion(){
        return this.version;
    }

    @GetMapping("/thisVersion")
    public String only(){
        return "only version 1.0.0 hava";
    }
}
