package com.atguigu.springcloud.controller;

public class Test2 {
    /**
     * @param args addby zxx ,Dec 9, 2008
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(new Test2().test());
        ;
    }

    int test() {
        try {
            return func1();
        } finally {
//            return func2();//func1 func2 2
            System.out.println(4);//func1 4 1
        }
    }

    int func1() {
        System.out.println("func1");
        return 1;
    }

    int func2() {
        System.out.println("func2");
        return 2;
    }
}
