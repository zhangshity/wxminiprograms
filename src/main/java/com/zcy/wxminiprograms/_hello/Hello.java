package com.zcy.wxminiprograms._hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //处理http请求,返回json格式
//@Controller //处理http请求。直接使用,404错误,要配合@ResposeBody
//@ResponseBody
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Hello() {
        return "Hello,World!";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String Hi() {
        return "Hi!";
    }
}
