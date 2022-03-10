package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

import javax.lang.model.element.PackageElement;

/**
 * @author shkstart
 * @create 2022- 03-06-13:50
 */

@Component
public class PaymentServiceFallback implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentServiceFallback----->paymentInfo_OK ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentServiceFallback----->paymentInfo_TimeOut";
    }
}
