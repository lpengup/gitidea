package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

public interface PayService {
    static int a=1;
    public abstract int create(Payment payment);

     int updatePay(Payment payment);
}
