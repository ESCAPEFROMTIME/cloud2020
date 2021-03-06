package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author shkstart
 * @create 2022- 03-03-15:16
 */

@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/zk")
    public String getServerPort(){


        return "springcloud with zookeeper:" + serverPort + "\t"
                + UUID.randomUUID().toString();

    }

}
