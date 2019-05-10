package com.bruceyang.luckymoney;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by yangxiaoge
 * 2019/5/10 13:48
 */
@RestController
public class HelloController {
    //获取配置文件application中的minMoney
    @Value("${minMoney}")
    private BigDecimal minMoney;
    @Value("${description}")
    private  String description;

    @GetMapping("/hello")
    public String sayHello() {
        return "minMoney: " + minMoney + " ，"+description;
    }
}
