package com.bruceyang.luckymoney;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangxiaoge
 * 2019/5/10 13:48
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "欢迎来到Spring Boot廖师兄课堂";
    }
}
