package com.example.springaop.impl;

import org.springframework.stereotype.Service;

/**
 * 购买商品
 */
@Service
public class Shopping {

    public void pay(){
        System.out.println("购买支付");
    }

    public void login(String name,int money){
        System.out.println(name+"买了:"+money+"元");
    }
}
