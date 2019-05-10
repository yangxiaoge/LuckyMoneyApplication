package com.bruceyang.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangxiaoge
 * 2019/5/10 13:48
 */
@RestController
public class HelloController {
    //获取配置文件application中的limit
    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String sayHello() {
        return "说明: " + limitConfig.getDescription();
    }
}
