package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2022- 03-03-15:58
 */



@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    public static final String SERVICE_HOST = "http://cloud-provider-payment";


    @GetMapping("/consumer/payment/zk")
    public String getServerPost(){

        return restTemplate.getForObject(SERVICE_HOST+"/payment/zk",String.class);


    }

}
