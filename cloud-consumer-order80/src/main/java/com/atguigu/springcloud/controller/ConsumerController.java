package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2022- 03-02-15:23
 */

@Slf4j
@RestController
public class ConsumerController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;



    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){

        log.info("日志功能没有问题！"+id);

      return  restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,
                CommonResult.class);

    }

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){

        return  restTemplate.postForObject(PAYMENT_URL+"/payment/create",
                payment,CommonResult.class);

    }


}
