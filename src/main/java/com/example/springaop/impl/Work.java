package com.example.springaop.impl;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 上班
 */
@Service
public class Work {
    public void login(String name) {
        System.out.println(name + "上班登陆了");
    }

    public void speak() {
        System.out.println("说话资料");
    }

    public void correctHomeWork() {
        System.out.println("批改作业");
    }
}
