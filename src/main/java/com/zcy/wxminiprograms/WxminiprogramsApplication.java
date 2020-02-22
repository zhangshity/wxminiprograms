package com.zcy.wxminiprograms;

import com.zcy.wxminiprograms._hello_demo_test.bean_test.HelloWord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WxminiprogramsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxminiprogramsApplication.class, args);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloWord helloWord = (HelloWord) applicationContext.getBean("helloworld");
//        helloWord.say();
    }
}
