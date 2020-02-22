package com.zcy.wxminiprograms._hello_demo_test.bean_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWord helloWord = (HelloWord) applicationContext.getBean("helloworld");
//        helloWord.setMsg("测试信息");
        helloWord.say();
    }
}
