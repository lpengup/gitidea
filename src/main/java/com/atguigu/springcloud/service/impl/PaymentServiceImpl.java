package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PayService;
import com.atguigu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;
    @Resource
    private PayService payService;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public Payment getPaymentById(Long id)
    {
        Payment payment = new Payment();
//        payment.setSerial("13");
//        int num = paymentDao.create(payment);
////        if (num == 1){
////            throw new RuntimeException();
////        }
//        payment.setSerial("22");
//
//        payment=paymentDao.getPaymentById(id);
        //第二种情形
//        Payment payment = new Payment();
//        payment.setSerial("16");
//        payService.create(payment);
//        payment=paymentDao.getPaymentById(id);
//        if (payment !=null){
//            throw new RuntimeException();
//        }

//第三中情形 事务传递
//        Payment payment2 = new Payment();
//        payment2.setSerial("101");
//        payService.create(payment2);

//        Payment payment3 = new Payment();
//        payment3.setSerial("32");
//        payService.updatePay(payment3);

        payment=paymentDao.getPaymentById(id);
        System.out.println(payment.getSerial());
        Payment payment2 = new Payment();
         payment2=paymentDao.getPaymentById(id);
        System.out.println(payment2.getSerial());
        return payment;
    }
}
