package com.atguigu.springcloud.controller;

import java.util.concurrent.TimeUnit;

public class Test {

    /**
     * @param args addby zxx ,Dec 9, 2008
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(new Test().test());
        ;
    }

    static int test() {
        int x = 1;
        try {
            return x;
        } finally {
            ++x;
            try {
                TimeUnit.SECONDS.sleep(5); }catch (InterruptedException e){ e.printStackTrace(); }
            System.out.println("final "+x);
        }
    }
}
