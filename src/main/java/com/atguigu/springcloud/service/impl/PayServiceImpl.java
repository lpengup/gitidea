package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PayServiceImpl implements PayService {
    @Resource
    PaymentDao paymentDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int create(Payment payment) {
        int num = paymentDao.create(payment);
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int updatePay(Payment payment) {
        Payment payment2=paymentDao.getPaymentById(1L);
        System.out.println(payment2.getSerial());
//        int num=paymentDao.updatePay(payment);

//        if (num == 1){
//            throw new RuntimeException();
//        }
        Payment payment3=paymentDao.getPaymentById(1L);
        System.out.println(payment3.getSerial());//取的是修改后的，因为是自己改的，而不是别人改的数据库，这不是事务的隔离级别
        return 0;
    }
}
