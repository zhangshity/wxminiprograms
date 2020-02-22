package com.zcy.wxminiprograms._hello_demo_test.bean_test;

public class HelloWord {

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public void say() {
        System.out.println(msg);
    }
}
