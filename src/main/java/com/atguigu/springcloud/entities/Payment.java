package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Payment implements Serializable,Cloneable {
    private Long id;
    private String serial;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Payment payment = new Payment(1L,"2");
        Payment clone = (Payment)payment.clone();
        System.out.println(clone == payment);
        System.out.println("******");
        Payment payment1=payment;
        System.out.println(payment == payment1);
        System.out.println(payment);

        System.out.println("===========");
        String s1="ab";
        String s2 = new String("ab");
        System.out.println(s1 == s2);//false
        String s3 ="ab";
        System.out.println(s1 == s3);//true 常量池
        String s4 ="a" + "b";
        System.out.println(s4);
        System.out.println(s4 == s1);//true
        String s5 ="abcd";
        String s6 =s4 +"cd";
        String s8 = new String("abcd");

        System.out.println(s6);
        System.out.println(s5 == s6);//false 
        System.out.println("777777");
        System.out.println(s8==s6);//false
        System.out.println("+++++++++++");
        String s7=s5;
        System.out.println(s5==s7);//true
    }

}