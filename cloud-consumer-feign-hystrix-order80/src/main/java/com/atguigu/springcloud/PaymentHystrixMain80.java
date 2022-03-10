package com.atguigu.springcloud;

import com.atguigu.springcloud.service.impl.PaymentServiceFallback;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shkstart
 * @create 2022- 03-06-9:02
 */

@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class PaymentHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain80.class,args);
    }
}
