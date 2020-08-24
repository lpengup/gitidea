package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

public interface PayService {
    public int create(Payment payment);

    public int updatePay(Payment payment);
}
